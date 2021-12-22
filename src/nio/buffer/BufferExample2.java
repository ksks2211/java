package nio.buffer;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

public class BufferExample2 {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(100);
        System.out.println("[Capacity] : "+byteBuffer.capacity());

        CharBuffer charBuffer = ByteBuffer.allocateDirect(100).asCharBuffer();
        System.out.println("[Capacity] : "+charBuffer.capacity());


        IntBuffer intBuffer = ByteBuffer.allocateDirect(100).asIntBuffer();

        System.out.println("[Capacity] : "+intBuffer.capacity());



    }
}
