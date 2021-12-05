package io.charstream;


import io.file.FileInfo;

import java.io.*;

public class BufferedReaderWriterExample {
    public static void main(String[] args) throws IOException {

        File readFile = new File("C:\\tmp\\lyrics.txt");
        File writeFile = new File("C:\\tmp\\lyrics_copy.txt");
        FileReader reader = new FileReader(readFile);
        FileWriter writer = new FileWriter(writeFile);
        char[] buf = new char[10];
        int charCnt = 0;

        long before = System.currentTimeMillis();
        while ((charCnt = reader.read(buf)) != -1) {
            writer.write(buf, 0, charCnt);
        }
        long after = System.currentTimeMillis();

        FileInfo.durationDesc(after - before,"[Not Using Buffer]");


        reader.close();
        writer.close();

        BufferedReader br = new BufferedReader(new FileReader(readFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(writeFile));
        before = System.currentTimeMillis();

        while ((charCnt = br.read(buf)) != -1) {
            bw.write(buf, 0, charCnt);
        }
        after = System.currentTimeMillis();

        FileInfo.durationDesc(after - before,"[Using Buffer]");


    }
}
