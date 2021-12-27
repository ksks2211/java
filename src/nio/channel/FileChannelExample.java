package nio.channel;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelExample {
    public static void main(String[] args) throws IOException {

        ByteBuffer buffer = ByteBuffer.allocateDirect(5).order(ByteOrder.nativeOrder());
        Path path = Paths.get("C:/tmp/file.txt");
        FileChannel fc = FileChannel.open(
                path,
                StandardOpenOption.READ
        );

        long size = fc.size();
        System.out.println("[File Size] : "+size);

        System.out.println("[File position] : "+fc.position());
        fc.position(5);
        System.out.println("[File position] : "+fc.position());


        int byteCount;
        StringBuilder sb = new StringBuilder();
        Charset charset = Charset.defaultCharset();
        while(true){
            byteCount = fc.read(buffer);
            if(byteCount == -1)break;
            buffer.flip();
            sb.append(charset.decode(buffer));
            buffer.clear();
        }

        System.out.println(sb.toString());


    }
}
