
package Lesson20;

import java.util.*;

public class HomeWork {
    
    public  ArrayList <String> abc(String ... s){
        ArrayList <String> aL = new ArrayList <>();
        
        for (String s1 : s){
            if (!aL.contains(s1)){
                aL.add(s1);
            }
        }
        Collections.sort(aL);        
        System.out.println (aL);
        return aL;    
        
    }
    
    public static void main(String[]args) {
        
        HomeWork hW = new HomeWork();
        
        hW.abc ("qwe","hello","qwe");
        
        
        
        
        
    }
    
}
