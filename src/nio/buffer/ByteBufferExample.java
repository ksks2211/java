package nio.buffer;


import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;

/*
* wrap
* ByteBuffer <-> IntBuffer
* */
public class ByteBufferExample {
    public static void main(String[] args) {
        int[] writeData = {10,20};

        IntBuffer writeIntBuffer = IntBuffer.wrap(writeData);
        ByteBuffer writeByteBuffer = ByteBuffer.allocate(writeIntBuffer.capacity()*4);

        for(int i=0;i<writeIntBuffer.capacity();i++){
            writeByteBuffer.putInt(writeIntBuffer.get(i));
        }
        writeByteBuffer.flip();


        IntBuffer readIntBuffer = writeByteBuffer.asIntBuffer();
        int[] readData = new int[readIntBuffer.capacity()];
        readIntBuffer.get(readData);

        System.out.println(Arrays.toString(readData));
    }
}
