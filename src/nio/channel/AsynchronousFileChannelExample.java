package nio.channel;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsynchronousFileChannelExample {
    public static void main(String[] args) throws IOException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );

        class Attachment{
                Path path;
                AsynchronousFileChannel fileChannel;
        }
        Charset charset = Charset.defaultCharset();



        for(int i=0;i<10;i++){
            Path path = Paths.get("C:/tmp/file"+i+".txt");
            Files.createDirectories(path.getParent());
            ByteBuffer byteBuffer = charset.encode("abcdefghijklmnop");
            AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(
                    path,
                    EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE),
                    executorService
            );
            Attachment attachment = new Attachment();
            attachment.path=path;
            attachment.fileChannel = fileChannel;


            CompletionHandler<Integer,Attachment> completionHandler = new CompletionHandler<>() {
                @Override
                public void completed(Integer result, Attachment attachment) {
                    System.out.println("[filename] "+attachment.path.getFileName()+"[byte written] "+result+"[thread] "+Thread.currentThread().getName());
                }

                @Override
                public void failed(Throwable exc, Attachment attachment) {
                    exc.printStackTrace();
                    try{
                        attachment.fileChannel.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            };

            fileChannel.write(byteBuffer,0,attachment,completionHandler);
        }

        Thread.sleep(1000);
        executorService.shutdown();

    }
}
