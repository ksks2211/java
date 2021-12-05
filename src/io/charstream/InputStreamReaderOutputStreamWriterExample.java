package io.charstream;

import java.io.*;

public class InputStreamReaderOutputStreamWriterExample {
    public static void main(String[] args) throws IOException {

        InputStream in = new FileInputStream("C:\\tmp\\lyrics.txt");
        OutputStream out = new FileOutputStream("C:\\tmp\\lyrics_copy.txt");


        InputStreamReader reader = new InputStreamReader(in,"utf-8");
        OutputStreamWriter writer = new OutputStreamWriter(out,"utf-8");


        char[] buf = new char[1024];
        int charCnt = 0;

        while((charCnt=reader.read(buf))!=-1){
            String tmp = new String(buf,0,charCnt);
            System.out.print(tmp);
            writer.write(buf,0,charCnt);
        }

        reader.close();
        writer.close();
    }
}
