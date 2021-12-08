package net.address;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLExample {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.reddit.com/r/MapPorn/search/?q=france&restrict_sr=1&sr_nsfw=");


        System.out.println("[authority] "+url.getAuthority());
        System.out.println("[path]"+url.getPath());
        System.out.println("[default port]"+url.getDefaultPort());
        System.out.println("[port]"+url.getPort());
        System.out.println("[file]"+url.getFile());
        System.out.println("[protocol]"+url.getProtocol());
        System.out.println("[query]"+url.getQuery());
        System.out.println("[ref]"+url.getRef());
        System.out.println("[userInfo]"+url.getUserInfo());


        // HttpURLConnection connection =(HttpURLConnection)url.getContent();



        url = new URL("https://www.ef.com/assetscdn/WIBIwq6RdJvcD9bc8RMd/cefcom-epi-site/reports/2021/ef-epi-2021-english.pdf");
        BufferedInputStream inputStream = new BufferedInputStream(url.openStream());
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("C:\\tmp\\ef-epi-2021-english.pdf"));

        byte[] buffer= new byte[1024*1024];
        int cnt = 0;

        while((cnt=inputStream.read(buffer))!=-1){
            outputStream.write(buffer,0,cnt);
        }
        inputStream.close();
        outputStream.close();
    }
}
