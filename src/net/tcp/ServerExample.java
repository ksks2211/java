package net.tcp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class ServerExample {
    public static void main(String[] args) {

        ServerSocket serverSocket = null;
        try{
            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress("localhost",5000));

            while(true){
                System.out.println("[Waiting...]");
                Socket socket = serverSocket.accept();
                InetSocketAddress remote = (InetSocketAddress) socket.getRemoteSocketAddress();
                System.out.println("[Connection accepted]"+remote.getHostName());



                byte[] buffer = new byte[100];
                String message = "";
                BufferedInputStream is = new BufferedInputStream(socket.getInputStream());

                int readByteCount = 0;
                System.out.println("--------------------------------------------------------");

                System.out.println("[Receiving Message From Client]");

                readByteCount = is.read(buffer);
                message = new String(buffer,0,readByteCount,"UTF-8");
                System.out.println(message);
                System.out.println("[Completed]");
                System.out.println("--------------------------------------------------------");


                BufferedOutputStream os = new BufferedOutputStream(socket.getOutputStream());
                System.out.println("[Send Message To Client]");
                message = "Hello Client From Server";
                os.write(message.getBytes());
                os.flush();
                System.out.println("[Completed]");
                System.out.println("--------------------------------------------------------");



                is.close();
                os.close();
                socket.close();


            }
        } catch (IOException e) {
            e.printStackTrace();

            if(!serverSocket.isClosed()){
                try {
                    serverSocket.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }


    }
}
