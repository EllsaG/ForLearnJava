package Lesson27_28;

import java.io.*;

public class Test19 {

    public static void main(String[] args) {
        Animal2 a = new Mouse();
        try {
            a.run();
        } catch (IOException e) {
            System.out.println("Exception poiman");

        }
    }

}

class Animal2 {

    void run() throws IOException {
        System.out.println("Animal run");
    }
}

class Mouse extends Animal2 {

    
    void run() {
        System.out.println("Mouse run");
    }
}
