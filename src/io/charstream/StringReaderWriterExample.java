package io.charstream;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;

public class StringReaderWriterExample {
    public static void main(String[] args) throws IOException {


        String[] strs = {"Apple","Banana","Orange"};
        StringWriter writer = new StringWriter();


        Arrays.stream(strs).forEach(str->{
            writer.write(str);
            writer.append(' ');
        });

        String str = writer.toString();

        System.out.println(str);

        StringReader reader = new StringReader(str);

        char[] buf = new char[5];
        int charCnt = 0;
        while((charCnt=reader.read(buf))!=-1){
            String s =new String(buf,0,charCnt);
            System.out.print(s);
        }

//        reader.close();
//        writer.close();



    }
}
