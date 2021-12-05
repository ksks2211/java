package io.charstream;

import java.io.*;

public class FileReaderWriterExample {
    public static void main(String[] args) throws IOException {
        File rFile = new File("C:\\tmp\\read.txt");

        FileReader reader = new FileReader(rFile);

        FileWriter writer = new FileWriter("C:\\tmp\\write.txt");



        int readCnt = 0;

        char[] buf = new char[5];
        while((readCnt = reader.read(buf))!=-1){
            writer.write(buf,0,readCnt);
        }

        writer.close();
        reader.close();

        writer = new FileWriter("C:\\tmp\\write.txt",true);

        String str = "\nAppened";
        char[] chars = str.toCharArray();

        writer.write(chars,0,chars.length);

        writer.close();


    }
}
