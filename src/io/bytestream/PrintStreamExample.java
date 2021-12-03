package io.bytestream;

import java.io.PrintStream;

public class PrintStreamExample {
    public static void main(String[] args) {


        PrintStream out = System.out;

        out.println(1);
        out.println(1.23);
        out.println(true);
        out.print("Hello\t World \n");

        out.printf("I am %d years old\n", 10);
        out.printf("I am  %.2f cm tall\n", 190.999999);

    }
}
