package nio.channel;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyMethodExample {
    public static void main(String[] args) throws IOException {
        Path from = Paths.get("C:/tmp/image.jpg");
        Path to = Paths.get("C:/tmp/image-copy.jpg");
        Files.copy(from,to, StandardCopyOption.REPLACE_EXISTING);

        System.out.println("File Copied");

    }
}
