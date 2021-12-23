package nio.buffer;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/*
* put, get method
* */
public class BufferExample3 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocateDirect(7).order(ByteOrder.nativeOrder());
        System.out.println("Initial State");
        printBufferState(buffer);

        buffer.put((byte)10);
        buffer.put((byte)11);
        System.out.println("2 bytes put");
        printBufferState(buffer);

        buffer.put((byte)12);
        buffer.put((byte)13);
        buffer.put((byte)14);
        System.out.println("3 more bytes put");
        printBufferState(buffer);


        System.out.println("flip ");
        buffer.flip();
        printBufferState(buffer);


        System.out.println("get 3 bytes and mark");
        buffer.get(new byte[3]);
        printBufferState(buffer);
        buffer.mark();

        System.out.println("get 2 bytes");
        buffer.get(new byte[2]);
        printBufferState(buffer);

        System.out.println("Reset");
        buffer.reset();
        printBufferState(buffer);

        System.out.println("Rewind");
        buffer.rewind();
        printBufferState(buffer);


        System.out.println("clear");
        buffer.clear();
        printBufferState(buffer);


    }
    public static void printBufferState(Buffer buffer){
        System.out.println("[position] : "+buffer.position());
        System.out.println("[limit] : "+buffer.limit());
        System.out.println("[capacity] : "+buffer.capacity());
        System.out.println("=================================");
    }

}
