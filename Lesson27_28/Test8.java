
package Lesson27_28;
import java.io.*;

public class Test8 {

    static StringBuilder abc() {
        StringBuilder a = new StringBuilder ("privet");
        try {
            File f = new File("test10.txt");
            FileInputStream fis = new FileInputStream(f);
        
        } catch (FileNotFoundException e) {
            System.out.println("Bil poyman Exception");
            System.out.println("peremennaia a v catch bloke = " + a);
        return a;
        } finally {
            a.append("!!!");
            System.out.println("eto block finaly");
            System.out.println("peremennaia a v catch bloke = " + a);
        }
        return a;
    }

    public static void main(String[] args) {
        
        System.out.println(abc());


        
        
    }
}
