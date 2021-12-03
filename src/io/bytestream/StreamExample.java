package io.bytestream;

import java.io.*;

public class StreamExample {
    public static void main(String[] args) throws IOException {

        File file = new File("C://tmp/lyrics.txt");

        InputStream is = new BufferedInputStream(new FileInputStream(file));

        System.out.println("[File Size] " + file.length());

        System.out.println("-------------------------------");
        is.mark(1000);
        System.out.println("[mark()]");
        System.out.println("[markSupported()]" + is.markSupported());
        int available = is.available();
        System.out.println("[available()] " + available);

        is.skip(100);
        System.out.println("[skip(100)]");

        available = is.available();
        System.out.println("[available()] " + available);


        is.reset();
        System.out.println("[reset()]");
        available = is.available();
        System.out.println("[available()] " + available);

        OutputStream out = new FileOutputStream("C://tmp/out.txt");


        out.write(65);
        out.write("Hello".getBytes());
        out.write("Good Bye".getBytes(), 4, 4);

        is.close();
        out.close();


    }
}
