
package Lesson27_28;
import java.io.*;
public class Test4 {
    
    void abc() {
        File f = new File("test8.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Vsem horoshego dnya!");
        } 
        catch (FileNotFoundException e) {
            System.out.println("Bil poyman Exception: " + e);
        }
    }
    void def(){
        System.out.println();
        abc();
    }
    
    
    public static void main (String [] args)  {
        
        Test4 t = new Test4 ();
        t.def();

        
    }
    
    
}
