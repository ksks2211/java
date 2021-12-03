package io.bytestream;

import java.io.*;

public class DataStreamExample {
    public static void main(String[] args) throws IOException {

        int a=10;
        boolean b = true;
        char c = 'G';
        double d = 3.14;
        String e = "Hello";


        System.out.println(a+","+b+","+c+","+d+","+e);
        DataOutputStream os = new DataOutputStream(new FileOutputStream("C:/upload/save.tmp"));

        os.writeInt(a);
        os.writeBoolean(true);
        os.writeChar(c);
        os.writeDouble(d);
        os.writeUTF(e);

        os.close();



        DataInputStream is = new DataInputStream(new FileInputStream("C:/upload/save.tmp"));

        a = is.readInt();
        b = is.readBoolean();
        c = is.readChar();
        d = is.readDouble();
        e = is.readUTF();
        System.out.print(a+","+b+","+c+","+d+","+e);


    }
}
