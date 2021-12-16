package nio.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class FilesExample4 {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("C:/tmp/lyrics.txt");
        Path target = Paths.get("C:/tmp/lyrics-cp.txt");
        Path copy = Files.copy(source, target);

        System.out.println(copy);

        System.out.println("---------------------------------------------");
        Stream<Path> list = Files.list(source.getParent());

        list.forEach(path->{
            System.out.println(path);
        });
        System.out.println("---------------------------------------------");

        Stream<Path> pathStream = Files.find(source.getParent(), 3, (path, basicFileAttributes) -> {
            showBasicFileAttr(basicFileAttributes);
            return true;
        });
        pathStream.forEach(path->{
            System.out.println(path);
        });

    }

    public static void showBasicFileAttr(BasicFileAttributes attributes){
        System.out.println("- - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("[creationTime] "+attributes.creationTime());
        System.out.println("[isRegularFile]"+attributes.isRegularFile());
        System.out.println("[lastModifiedTime]"+attributes.lastModifiedTime());
        System.out.println("[size]"+attributes.size());
        System.out.println("[isDirectory]"+attributes.isDirectory());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - -");

    }
}
