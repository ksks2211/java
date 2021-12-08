package io.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

public class RandomAccessFileExample {
    public static void main(String[] args) throws IOException {



        // read
        RandomAccessFile file = new RandomAccessFile("C:\\tmp\\lyrics.txt","rw");

        long length = file.length();
        System.out.println("[length] "+length);
        System.out.println("[getFilePointer] "+file.getFilePointer());


        byte[] buffer = new byte[10];
        int cnt=0;

        while((cnt=file.read(buffer))!=-1){
            System.out.print(new String(buffer,0,cnt));
        }
        System.out.println();
        System.out.println("[getFilePointer] "+file.getFilePointer());


        // write(append)
        System.out.println("[append]");
        file.write("\nHello World\n".getBytes(StandardCharsets.UTF_8));
        System.out.println("[getFilePointer] "+file.getFilePointer());

        // readFile
        file.seek(0);
        System.out.println("[length] "+file.length());
        while((cnt=file.read(buffer))!=-1){
            System.out.print(new String(buffer,0,cnt));
        }

        // remove appended content
        file.setLength(length);
        file.seek(0);
        System.out.println("[length] "+file.length());
        while((cnt=file.read(buffer))!=-1){
            System.out.print(new String(buffer,0,cnt));
        }

        file.close();
    }
}
