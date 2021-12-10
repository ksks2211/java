package net.udp;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UdpSenderExample {
    public static void main(String[] args) throws IOException {

        DatagramSocket datagramSocket = new DatagramSocket();

        System.out.println("[ Start Sending ]");


        for(int i=1;i<10;i++){
            String data = "Message " + i;
            byte[] byteArr = data.getBytes("UTF-8");
            DatagramPacket packet = new DatagramPacket(byteArr, byteArr.length, new InetSocketAddress("localhost",5000));


            datagramSocket.send(packet);
            System.out.println("[Send "+byteArr.length+" bytes]");
        }



    }
}
