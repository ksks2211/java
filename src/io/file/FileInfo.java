package io.file;

import java.io.File;


public class FileInfo {
    public static void fileSizeDesc(File file){
        if(file.exists()) {
            System.out.println("--------------------------------------------------------");
            System.out.println("[File Name] " + file.getName());

            double length = Double.valueOf(file.length());
            String unit = " B";
            if(length >= 1000){
                length /=1000;
                unit= " KB";
            }
            if(length >= 1000){
                length /=1000;
                unit= " MB";
            }
            if(length >= 1000){
                length /=1000;
                unit= " GB";
            }
            if(length >= 1000){
                length /=1000;
                unit= " TB";
            }
            System.out.println("[File Size] "+Math.round(length)+unit);
        }
    }
    public static void durationDesc(long _duration, String title){

        System.out.printf("----------------------------%s----------------------------\n",title);
        double duration = (long)_duration;
        String unit = " ms";
        if (duration>1000){
            unit=" s";
            duration/=1000;
        }
        System.out.println("[File Process Time] "+duration+unit);
    }
}
