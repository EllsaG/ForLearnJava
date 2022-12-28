
package Lesson27_28;
import java.io.IOException;

public class Test2 {
    public static void main (String [] args){
        int [] array = {1,4,0};
        String s = null ;
        try{
        System.out.println(s.length());
        }
        catch(Exception e){
            System.out.println("Bil poyman Exception: " + e);
        }
        System.out.println("hello");
        
    }
    
}
