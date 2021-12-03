package io.bytestream;

import java.io.*;

public class FileStreamExample2 {
    public static void main(String[] args) throws IOException {
        File file = new File("C://upload/exfile.txt");
        FileOutputStream fos = new FileOutputStream(file, true);
        PrintStream out = new PrintStream(fos);

        out.println("\nadd this line");
        out.close();
        fos.close();

        FileInputStream in = new FileInputStream(file);

        byte[] buffer = new byte[1024];

        int read = in.read(buffer);

        String content = new String(buffer, 0, read);
        System.out.println(content);
        in.close();
    }
}
