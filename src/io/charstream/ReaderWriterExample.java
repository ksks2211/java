package io.charstream;

import java.io.*;

public class ReaderWriterExample {
    public static void main(String[] args) throws IOException {

        File rFile = new File("C:\\tmp\\read.txt");
        Reader reader = new FileReader(rFile);
        File wFile = new File("C:\\tmp\\write.txt");
        Writer writer = new FileWriter(wFile);

        char[] buf = new char[10];

        int readChar=0;

        while((readChar = reader.read(buf))!=-1){
            System.out.print(new String(buf,0,readChar));
            writer.write(buf,0,readChar);
        }
        writer.append("\nAppended....");

        reader.close();
        writer.close();



    }
}
