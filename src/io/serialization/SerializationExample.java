package io.serialization;

import java.io.*;

public class SerializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student std1 = new Student(1999, "kim",new Major(Major.DEPART.CS),new Major(Major.DEPART.MATH));

        File file = new File("C:\\tmp\\obj.dat");

        System.out.println(std1);





        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

        oos.writeObject(std1);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        Student std2 =(Student) ois.readObject();
        System.out.println(std2);


    }
}
