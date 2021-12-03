package io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayStreamExample {
    public static void main(String[] args) {
        String from = "Hello World";
        System.out.println("From : " + from);
        byte[] bytes = from.getBytes();


        // ByteArrayInputStream
        ByteArrayInputStream is = new ByteArrayInputStream(bytes);


        // ByteArrayOutputStream
        ByteArrayOutputStream os = new ByteArrayOutputStream();


        int tmp = 0;
        int k = 0;
        while ((tmp = is.read()) != -1) {
            os.write(tmp);
            k++;
        }
        System.out.println("[Read & Write] " + k + " times");
        String to = new String(os.toByteArray());
        System.out.println("To : " + to);
    }
}
