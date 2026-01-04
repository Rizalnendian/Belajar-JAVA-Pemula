import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new  FileInputStream("D:/Coding/Java/TUTORIAL JAVA/I & O/Stream Byte/src/input.txt");
            out = new FileOutputStream("D:/Coding/Java/TUTORIAL JAVA/I & O/Stream Byte/src/output.txt");

            int c;
            while ((c = in.read()) != -1){
                out.write(c);
            }
        }

        finally {
            if (in != null){
                in.close();
            }
            if (out != null){
                out.close();
            }
        }


    }
}
