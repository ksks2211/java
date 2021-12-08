package io.file;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileDescriptorExample {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\tmp\\myFile.txt");
        FileOutputStream fos = new FileOutputStream(file);



        FileDescriptor fd = fos.getFD();
        FileOutputStream fos2 = new FileOutputStream(fd);

        fos2.write("Hello World".getBytes(StandardCharsets.UTF_8));
        fos.close();
        fos2.close();

    }
}
