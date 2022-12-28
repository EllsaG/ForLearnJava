package Lesson27_28;

import java.io.*;

public class Test9 {

    static void abc() throws FileNotFoundException {
        try {
            File f = new File("test10.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception poyman i nemnogo obrabotan");
            throw e;
        } finally {
            System.out.println("eto block finaly");
        }
    }

    void method() {
        try {
            abc();
        } catch (FileNotFoundException e) {
            System.out.println("Exception poyman i nemnogo obrabotan");
        }

    }
}
