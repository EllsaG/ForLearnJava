
package Lesson20.ArrayListMethods;

import java.util.*;

public class Test4 {
    public static void main(String[]args) {
        ArrayList  al1 = new ArrayList ();
        al1.add ("one");
        al1.add ("two");
        al1.add ("three");
        al1.add ("four");
        al1.add ("five");
        
        for (Object o : al1){
            System.out.println ("number = " + o + " and length = " + ((String )o).length());            
        }
        
        
        
        
    }    
}
