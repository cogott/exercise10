import java.io.*;

public class copyFile {
    public static void main(String[] args) {
        int cuba;

        try(FileInputStream fis = new FileInputStream("file.txt");
            FileOutputStream fos = new FileOutputStream("fileCopy.txt")){
            do{
                cuba = fis.read();
                if((char)cuba == ' ') cuba = '-';
                if(cuba != -1) fos.write(cuba);
            }while(cuba != -1);
        } catch (IOException e){
            System.out.println("Error!!");
        }
    }
}
