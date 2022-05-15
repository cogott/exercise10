import java.io.FileFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class showFile {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = null;
        int bajt;

        try {
            fis = new FileInputStream("test123.txt");
            do{
                bajt = fis.read();
                if (bajt != -1)System.out.println((char) bajt);
            } while (bajt != -1 );
        } catch(IOException e) {
            System.out.println("Error reading");
        }


    }

}
