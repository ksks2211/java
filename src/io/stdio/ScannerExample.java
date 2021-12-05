package io.stdio;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("[Boolean] : ");
        boolean b = scanner.nextBoolean();

        System.out.println(b);
        scanner.reset();

        System.out.print("[Int] : ");
        int i = scanner.nextInt();
        System.out.println(i);

    }
}
