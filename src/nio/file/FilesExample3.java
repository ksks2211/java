package nio.file;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class FilesExample3 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/tmp/lyrics.txt");

        Stream<String> lines = Files.lines(path);

        lines.forEach(line->{
            System.out.println(line);
        });


        System.out.println("------------------------------------");
        String appended = "\nNew line";

        Files.write(path,appended.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);

        Files.lines(path).forEach(line->{
            System.out.println(line);
        });

    }
}
