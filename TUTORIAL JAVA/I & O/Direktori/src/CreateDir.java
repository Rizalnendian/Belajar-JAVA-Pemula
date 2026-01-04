import java.io.File;
import java.io.*;

public class CreateDir {
    static void main(String[] args) {
        String dirname = "D:/Coding/Java/TUTORIAL JAVA/I & O/Direktori/src/";
        File d = new File(dirname);

        d.mkdirs(); //membuat direktori
    }
}
