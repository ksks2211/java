package io.serialization;

import java.io.*;

public class SerializationExample2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User("email123@email.com","1111","mmmoooo");

        File file = new File("C:\\tmp\\obj.dat");

        System.out.println(user);



        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

        oos.writeObject(user);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        user =(User) ois.readObject();
        System.out.println(user);


    }
}
