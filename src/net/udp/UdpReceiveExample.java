package net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpReceiveExample {
    public static void main(String[] args) throws SocketException, InterruptedException {
        DatagramSocket datagramSocket = new DatagramSocket(5000);


        Thread thread = new Thread(){
            @Override
            public void run(){
                System.out.println("[Receiving Message]");

                try{
                    while(true){
                        DatagramPacket packet = new DatagramPacket(new byte[100],100);
                        datagramSocket.receive(packet);
                        String data = new String(packet.getData(),0,packet.getLength(),"UTF-8");
                        System.out.println("[ Message ]  : "+data);
                    }
                } catch (IOException e) {
                    //e.printStackTrace();
                    System.out.println("[ CLOSE ]");
                }
            }
        };
        thread.start();
        Thread.sleep(10000);
        datagramSocket.close();


    }
}
