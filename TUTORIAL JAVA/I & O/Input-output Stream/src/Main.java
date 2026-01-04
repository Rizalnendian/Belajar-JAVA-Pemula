import java.io.*;

public class Main {
    static void main(String[] args) {
        try {
            byte bWrite[] = {11,22,33,44,55};
            OutputStream os = new FileOutputStream("D:/Coding/Java/TUTORIAL JAVA/I & O/Input-output Stream/src/test.txt");
            for (int x=0; x<bWrite.length;x++){
                os.write(bWrite[x]);
            }
            os.close();

            InputStream is = new FileInputStream("D:/Coding/Java/TUTORIAL JAVA/I & O/Input-output Stream/src/test.txt");
            int size = is.available();

            for (int i=0; i<size;i++)
            {
                System.out.println((char) is.read()+" ");
            }
            is.close();
        }
        catch (IOException e){
            System.out.println("Exception");
        }
    }
}