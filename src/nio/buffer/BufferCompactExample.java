package nio.buffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/*
* Compact
* */
public class BufferCompactExample {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocateDirect(7).order(ByteOrder.nativeOrder());
        buffer.put((byte)10);
        buffer.put((byte)11);
        buffer.put((byte)12);
        buffer.put((byte)13);
        buffer.put((byte)14);
        System.out.println("put 5 bytes");
        printState(buffer);

        System.out.println("flip");
        buffer.flip();
        printState(buffer);

        buffer.get(new byte[3]);
        System.out.println("get 3 bytes");
        printState(buffer);

        System.out.println("compact");
        buffer.compact();
        printState(buffer);





    }

    public static void printState(ByteBuffer buffer){
        int lim = buffer.limit();
        int pos = buffer.position();
        for(int i=0;i<lim;i++){
            if(i==pos) System.out.print("["+buffer.get(i)+"] ");
            else System.out.print(buffer.get(i)+" ");
        }
        System.out.println();
        System.out.println("[position] : "+buffer.position());
        System.out.println("[limit] : "+buffer.limit());
        System.out.println("[capacity] : "+buffer.capacity());
        System.out.println("=======================================================");
    }
}
