import java.io.File;
import java.io.*;

public class ListringDirektori {
    static void main(String[] args) {
        File file = null;
        String[] paths;

        try{
            file = new File("D:/Coding/Java/TUTORIAL JAVA/I & O/Direktori/src/");
            paths = file.list();
            for (String path:paths){
                System.out.println(path);
            }
        }

        catch (Exception e){
            e.printStackTrace();
        }
    }
}
