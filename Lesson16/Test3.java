
package Lesson16;

public class Test3 {
    public static void main (String[]args){
        int a = 5;
        int b = 6;
        String s = "ok";
        
        System.out.println(a + b + s); // в этом случае a и b сложатся        
        System.out.println("" + (a + b) + s); // в этом случае a и b сложатся 
        System.out.println("" + a + b + s); // в этом случае a и b складываться не будут
        
        String s1 = "hello";
       // String s2 = 8+a; // нельзя присваивать классу String результат суммы int
        System.out.println(s1);
        
        
        
        
        
        
        
        
        
        
        
     }   
}
