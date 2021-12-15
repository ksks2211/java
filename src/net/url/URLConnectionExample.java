package net.url;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class URLConnectionExample {
    public static void main(String[] args) throws MalformedURLException {
        URL movieURL = new URL("http://192.168.0.3:3000/static/video.mp4");
        try {
            HttpURLConnection conn = (HttpURLConnection) movieURL.openConnection();


            Map<String, List<String>> headerFields = conn.getHeaderFields();

            headerFields.forEach( (header,contents)->{
                System.out.println("["+header+"] : "+ contents.toString());
            });

            BufferedInputStream is = new BufferedInputStream(conn.getInputStream());
            BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream("C://tmp/video.mp4"));
            byte[] buffer = new byte[1024*1024];
            int readCount=0;
            while((readCount=is.read(buffer))!=-1){
                    os.write(buffer,0,readCount);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
