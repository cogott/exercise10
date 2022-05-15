import java.io.*;
import java.net.URL;

public class task5 {
    public static void main(String[] args) throws IOException{
        URL url = new URL ("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the first three digits of your bank account");
        String accountNumber = br.readLine();

        try(BufferedReader reader= new BufferedReader(new InputStreamReader(url.openStream()))){
            String Line;
            System.out.println("Reads data from the file");
            while((Line = reader.readLine()) != null){
                System.out.println(Line);

                String[] words = Line.split("\\t+");
                String bankNumber = words[0].trim();
                String bankName = words[1].trim();
                if(bankNumber.equals(accountNumber)) {
                    System.out.println("Bank Number: " + bankNumber + "Bank Name : " + bankName);
                    break;
                }
            }

        }catch(IOException e){
            System.out.println("Data loading error");
        }

    }
}
