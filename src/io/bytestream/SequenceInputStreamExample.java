package io.bytestream;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamExample {
    public static void main(String[] args) throws IOException {
        Vector files = new Vector();

        files.add(new FileInputStream("C:/upload/a.txt"));
        files.add(new FileInputStream("C:/upload/b.txt"));

        Enumeration elements = files.elements();
        SequenceInputStream is = new SequenceInputStream(elements);


        byte[] buffer = new byte[1024];

        ByteArrayOutputStream os = new ByteArrayOutputStream();

        int cnt = 0;
        while ((cnt = is.read(buffer)) != -1) {
            os.write(buffer, 0, cnt);
        }

        System.out.print("[Merged(a.txt b.txt )] ");
        System.out.println(new String(os.toByteArray()));
    }
}
