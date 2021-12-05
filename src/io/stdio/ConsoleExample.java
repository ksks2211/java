package io.stdio;

import java.io.Console;

public class ConsoleExample {
    public static void main(String[] args) {
        Console console = System.console();


        System.out.print("[Id] : ");
        String id = console.readLine();
        char[] passwordChars = console.readPassword("[%s] : ","Password");
        String password = new String(passwordChars);


        while(!id.equals("id")|| ! password.equals("password")){
            System.out.println("[login] : Failed");
            System.out.print("[Id] : ");
            id = console.readLine();
            password = new String(console.readPassword("[%s] : ","Password"));
        }

        System.out.println("[login] : Success");

    }
}
