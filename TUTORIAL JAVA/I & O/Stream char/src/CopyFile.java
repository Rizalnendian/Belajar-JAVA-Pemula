import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {

        FileReader in = null;
        FileWriter out = null;

        try {
            in = new  FileReader("D:/Coding/Java/TUTORIAL JAVA/I & O/Stream char/src/input.txt");
            out = new FileWriter("D:/Coding/Java/TUTORIAL JAVA/I & O/Stream char/src/output.txt");

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
