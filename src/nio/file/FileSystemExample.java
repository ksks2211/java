package nio.file;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemExample {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        System.out.println("-------------[File Stores]----------------");
        Iterable<FileStore> fileStores = fs.getFileStores();
        fileStores.forEach(FileSystemExample::showFileStore);

        System.out.println("----------------[Root Directories]------------------");
        Iterable<Path> rootDirectories = fs.getRootDirectories();
        rootDirectories.forEach(FileSystemExample::showPath);

        System.out.println("---------------------------------------------------");
        System.out.println("[separator] "+fs.getSeparator());
    }

    public static void showFileStore(FileStore store) {
        try {
            System.out.println("[name] " + store.name());
            System.out.println("[type] " + store.type());
            System.out.println("[Total Space] " + store.getTotalSpace());
            System.out.println("[Unallocated Space] " + store.getUnallocatedSpace());
            System.out.println("[Usable Space] " + store.getUsableSpace());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showPath(Path path) {
        System.out.println("[path] "+path);
    }
}
