package io.bytestream;

import io.file.FileInfo;

import java.io.*;

        public class BufferedStreamExample {
            public static void main(String[] args) throws IOException {
                long before = System.currentTimeMillis();

                File fromFile = new File("C:/upload/video.avi");
                FileInputStream is = new FileInputStream(fromFile);
                BufferedInputStream bis = new BufferedInputStream(is);

        byte[] buffer = new byte[1024];

        File toFile = new File("C:/download/video.avi");
        FileOutputStream os  = new FileOutputStream(toFile);
        BufferedOutputStream bos = new BufferedOutputStream(os);

        int cnt=0;
        int k =0;
        while((cnt=bis.read(buffer))!=-1){
            bos.write(buffer,0,cnt);
            k++;
        }

        bis.close();
        bos.close();


        long after = System.currentTimeMillis();
        System.out.println("[Read & Write] "+k+" times");
        FileInfo.fileSizeDesc(toFile);
        FileInfo.durationDesc(after-before);
    }
}
