package nio.buffer;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/*
* Buffer Properties
* */
public class BufferExample2 {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(100);
        bufferDesc(byteBuffer);

        CharBuffer charBuffer = ByteBuffer.allocateDirect(100).asCharBuffer();
        bufferDesc(charBuffer);

        IntBuffer intBuffer = ByteBuffer.allocateDirect(100).asIntBuffer();
        bufferDesc(intBuffer);

    }

    public static void bufferDesc(Buffer buffer){
        System.out.println("[Capacity] : "+buffer.capacity());
        System.out.println("[limit] : "+buffer.limit());
        System.out.println("[position] : "+buffer.position());
        System.out.println("===============================");
    }
}
