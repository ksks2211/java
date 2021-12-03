package io.bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStream {
    public static void main(String[] args) throws FileNotFoundException {
        Vector files = new Vector();
        
        files.add(new FileInputStream("C:/upload/a.txt"));
        files.add(new FileInputStream("C:/upload/b.txt"));

        Enumeration elements = files.elements();
        SequenceInputStream in = new SequenceInputStream();

        
        
        
    }
}
