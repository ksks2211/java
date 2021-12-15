package nio.file;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class PathExample {
    public static void main(String[] args) {
        Path path = Paths.get(URI.create("file:///C:/tmp/lyrics.txt"));
        Path otherPath = Paths.get("C:","tmp","lyrics.txt");

        System.out.println("[compareTo] : "+path.compareTo(otherPath));
        System.out.println("[getFileName] : "+path.getFileName());
        System.out.println("[getFileSystem] : "+path.getFileSystem());
        System.out.println("[getName(1)] : "+path.getName(1));
        System.out.println("[getName(0)] : "+path.getName(0));
        System.out.println("[getNameCount] : "+path.getNameCount());

        Path parent = path.getParent();
        System.out.println("[getParent] : "+parent);
        System.out.println("[getRoot] : "+path.getRoot());
        System.out.println("[normalize] : "+path.normalize());
        System.out.println("[toFile]"+path.toFile());
        System.out.println("[toURI]"+path.toUri());

        System.out.println("------------------------------");

        Iterator<Path> iter = path.iterator();
        while(iter.hasNext()){
            Path next = iter.next();
            System.out.println(next);
        }


    }
}
