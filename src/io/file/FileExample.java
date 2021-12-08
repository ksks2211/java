package io.file;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class FileExample {
    public static void main(String[] args) throws URISyntaxException, IOException {

        /* CREATE FILE */
        File file1 = new File("C:\\tmp\\myFile1.txt");
        File file2 = new File("C:\\tmp","myFile2.txt");
        File file3 = new File(file2.getParentFile(),"myFile3.txt");
        File file4 = new File(new URI("file:///c:/tmp/myFile4.txt"));




        /* METHOD */

        System.out.println("getName : "+file1.getName());


        System.out.println("exists (before createNewFile) : "+file1.exists());
        file1.createNewFile();
        System.out.println("exists (after createNewFile) : "+file1.exists());


        System.out.println("gatParent : "+file1.getParent());
        System.out.println("getParentFile : "+file1.getParentFile());

        System.out.println("getPath : "+file1.getPath());
        System.out.println("getAbsolutePath "+file1.getAbsolutePath());

        System.out.println("isFile : "+file1.isFile());


        System.out.println("canExecute : "+file1.canExecute());
        System.out.println("canRead : "+file1.canRead());
        System.out.println("canWrite : "+file1.canWrite());

        file1.renameTo(new File("C:\\tmp\\myRenamedFile.txt"));

        System.out.println("getName (after rename) : "+file1.getName());







    }
}
