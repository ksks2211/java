package net.tcp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
    public static void main(String[] args) {
        Socket socket = null;

        try{
            socket =  new Socket();
            System.out.println("[Connecting...]");
            socket.connect(new InetSocketAddress("localhost",5000));
            System.out.println("[Connected]");



            System.out.println("--------------------------------------------------------");
            System.out.println("[Send Message To Server]");
            byte[] buffer = null;
            String message = null;
            BufferedOutputStream os = new BufferedOutputStream(socket.getOutputStream());
            message = "Hello to Server from Client";
            buffer = message.getBytes("UTF-8");
            os.write(buffer);
            os.flush();
            //os.close();
            System.out.println(socket.isClosed());

            System.out.println("[Completed]");

            System.out.println("--------------------------------------------------------");

            BufferedInputStream is = new BufferedInputStream(socket.getInputStream());
            buffer = new byte[100];

            int readByteCount  = 0;

            System.out.println("[Received Message From Server] ");
            readByteCount = is.read(buffer);

            System.out.println(new String(buffer,0,readByteCount, "UTF-8"));
            System.out.println("Completed");
            System.out.println("--------------------------------------------------------");


            os.close();
            is.close();
            socket.close();

        } catch (IOException e) {
            if(!socket.isClosed()){
                try{
                    socket.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
            e.printStackTrace();
        }
    }
}
