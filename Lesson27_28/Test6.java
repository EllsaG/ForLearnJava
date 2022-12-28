
package Lesson27_28;
import java.io.*;

public class Test6 {

    public static void main(String[] args) {
        try {
            File f = new File("test8.txt");
            FileInputStream fis = new FileInputStream(f);
        }
        catch (FileNotFoundException e){
            System.out.println("Bil poyman Exception 1");            
        }
        catch (NullPointerException e){
            System.out.println("Bil poyman Exception 2");            
        }
        
        
        
    }
}
