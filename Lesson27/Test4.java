
package Lesson27;
import java.io.*;
public class Test4 {
    public static void main (String [] args) {
        File f = new File ("test8.txt");
        
        try{        
            FileInputStream fis = new FileInputStream (f);
            System.out.println ("Vsem horoshego dnya!");
        }
        
        catch (FileNotFoundException e) {
            System.out.println("Bil poyman Exception: " + e);
        }
        
        catch (NullPointerException e) {
            System.out.println("Bil poyman Exception: " + e);
        }
        
        finally{
            System.out.println ("Eto finally block");
        }
        
        System.out.println ("Danniy kod uje ne imeet otnosheniya k isklycheniyam");
        
    }
    
    
}
