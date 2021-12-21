package nio.file;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class WatchServiceExample {
    public static void main(String[] args) throws IOException {

        WatchService watchService = FileSystems.getDefault().newWatchService();
        Path path = Paths.get("C:/tmp");


        path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);
        
        while(true){
            try {
                WatchKey watchKey = watchService.take();
                showEvents(watchKey);
                watchKey.reset();;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void showEvents(WatchKey watchKey){
        List<WatchEvent<?>> watchEvents = watchKey.pollEvents();
        for(WatchEvent event: watchEvents){
            WatchEvent.Kind kind = event.kind();
            Path context = (Path) event.context();


            if(kind == StandardWatchEventKinds.ENTRY_CREATE){
                System.out.println("[Created] : "+context);
            }else if(kind == StandardWatchEventKinds.ENTRY_DELETE){
                System.out.println("[Deleted] : "+context);
            }else{
                System.out.println("[Modified] : "+context);
            }

            System.out.println();
        }
    }
}
