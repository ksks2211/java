package nio.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
*  Read Properties of File or Directory
* */
public class FilesExample {

    public static void main(String[] args) throws IOException {



        Path file1 = Paths.get("C:/tmp/lyrics.txt");
        Path dir1 = Paths.get("C:/tmp");
        Path notExists = Paths.get("C:/tmp/tmp/tmp");

        System.out.println("------------------------------------------");
        showFile(file1);
        System.out.println("------------------------------------------");
        showFile(dir1);
        System.out.println("------------------------------------------");
        showFile(notExists);

    }

    public static void showFile(Path path) throws IOException {
        System.out.println("[isDirectory] "+ Files.isDirectory(path));
        System.out.println("[isRegularFile] "+Files.isRegularFile(path));
        boolean notExists = Files.notExists(path);
        System.out.println("[notExists] "+notExists);
        if(!notExists) {
            System.out.println("[isHidden] " + Files.isHidden(path));
            System.out.println("[isReadable] " + Files.isReadable(path));
            System.out.println("[isWritable] " + Files.isWritable(path));
            System.out.println("[getOwner] " + Files.getOwner(path));
            System.out.println("[size]" + Files.size(path));
        }
    }
}
