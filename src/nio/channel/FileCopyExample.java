package nio.channel;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileCopyExample {
    public static void main(String[] args) throws IOException {
        Path from = Paths.get("C:/tmp/image.jpg");
        Path to = Paths.get("C:/tmp/image-cp.jpg");

        FileChannel file_from = FileChannel.open(from, StandardOpenOption.READ);

        FileChannel file_to = FileChannel.open(to, StandardOpenOption.CREATE, StandardOpenOption.WRITE);

        ByteBuffer buffer = ByteBuffer.allocateDirect(100).order(ByteOrder.nativeOrder());
        int byteCount = 0;
        while(true){
            byteCount = file_from.read(buffer);
            if(byteCount == -1)break;
            buffer.flip();
            file_to.write(buffer);
            buffer.clear();
        }

        file_from.close();
        file_to.close();
        System.out.println("File Copied");
    }
}
