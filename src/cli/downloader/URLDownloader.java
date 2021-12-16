package cli.downloader;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class URLDownloader {
    public static void main(String[] args) {
        URL downloadURL;
        String fileName;
        try {
            if(args.length <1) throw new Exception("args needed");
            downloadURL = new URL(args[0]);
            HttpURLConnection conn = (HttpURLConnection) downloadURL.openConnection();
            Map<String, List<String>> headerFields = conn.getHeaderFields();
            headerFields.forEach( (header,contents)->{
                System.out.println("["+header+"] : "+ contents.toString());
            });
            BufferedInputStream is = new BufferedInputStream(conn.getInputStream());
            if(args.length<2){
                fileName  = args[1];
            }else{
                String[] strings = args[0].split("/");
                fileName = strings[strings.length-1];
            }
            BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream("C:/download/"+fileName));
            System.out.println("[available]"+is.available());
            byte[] buffer = new byte[1024*1024];
            int readCount=0;
            while((readCount=is.read(buffer))!=-1){
                os.write(buffer,0,readCount);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
