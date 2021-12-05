package io.stdio;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class StandardInOutErrExample {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        PrintStream out = System.out;
        PrintStream err = System.err;


        InputStreamReader is = new InputStreamReader(in, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(is);


        String str;
        while(true) {
            System.out.print("[In] : ");
            str = reader.readLine();
            if(str.equals("q")){
                err.println("[Exit]");
                break;
            }
            System.out.print("[out] : ");
            out.println(str);
            System.out.println("---------------------------------------");
        }

    }
}
