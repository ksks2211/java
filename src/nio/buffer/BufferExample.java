package nio.buffer;

import java.nio.ByteBuffer;

public class BufferExample {
    public static void main(String[] args) {
        try {
            ByteBuffer directBuffer = ByteBuffer.allocateDirect(2000 * 1024 * 1024);
            System.out.println("Direct Buffer Created");
        }catch(Exception e){
            System.out.println("Direct Buffer Creation Failed");
        }

        try{
            ByteBuffer nonDirectBuffer = ByteBuffer.allocate(2000*1024*1024);
            System.out.println("Non-Direct Buffer Created");
        }catch(Exception e){
            System.out.println("Non-Direct Buffer Creation Failed");
        }
    }
}
