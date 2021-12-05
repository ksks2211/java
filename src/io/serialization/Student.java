package io.serialization;

import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable {


    private int yearOfBirth;
    private String name;
    private Major[] majors;
    transient int age;

    public Student(int yearOfBirth, String name, Major ... majors) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.age = 2021-yearOfBirth;
        this.majors=majors;
    }


    @Override
    public String toString() {
        return "Student{" +
                "yearOfBirth=" + yearOfBirth +
                ", name='" + name + '\'' +
                ", majors=" + Arrays.toString(majors) +
                ", age=" + age +
                '}';
    }
}
