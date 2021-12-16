package nio.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
*  Create & Delete Directory and File
*
* */
public class FilesExample2 {
    public static void main(String[] args) {

        Path path = Paths.get("C:/tmp/newdir/newdir2/newdir3/newfile.txt");
        try {
            Files.createDirectories(path.getParent());
            Files.createFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Files.delete(path);
            Files.delete(path.getParent());
            Files.delete(path.getParent().getParent());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
