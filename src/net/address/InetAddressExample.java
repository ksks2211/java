package net.address;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress reddit = InetAddress.getByName("www.reddit.com");

        InetAddress local = InetAddress.getLocalHost();

        System.out.println("[www.reddit.com]"+reddit.getHostAddress());
        System.out.println("[My Address]"+local.getHostAddress());


        System.out.println(reddit.getHostName());
        System.out.println(reddit.isMulticastAddress());
        System.out.println(reddit.isLoopbackAddress());


    }
}
