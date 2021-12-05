package io.bytestream;

import io.file.FileInfo;

import java.io.*;

public class FileStreamExample {
    public static void main(String[] args) throws IOException {
        long before = System.currentTimeMillis();

        File fromFile = new File("C:/upload/video.avi");
        FileInputStream is = new FileInputStream(fromFile);

        byte[] buffer = new byte[1024];

        File toFile = new File("C:/download/video.avi");
        FileOutputStream os = new FileOutputStream(toFile);

        int cnt = 0;
        int k = 0;
        while ((cnt = is.read(buffer)) != -1) {
            os.write(buffer, 0, cnt);
            k++;
        }

        is.close();
        os.close();


        long after = System.currentTimeMillis();
        System.out.println("[Read & Write] " + k + " times");
        FileInfo.fileSizeDesc(toFile);
        FileInfo.durationDesc(after - before,"");

    }
}
