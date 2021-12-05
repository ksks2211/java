package io.charstream;

import java.io.*;

public class PrintWriterExample {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter(System.out);

        pw.print("Hello\n");
        pw.println("Hello");

        pw.close();



    }
}
