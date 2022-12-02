
package Lesson14;

public class Test6 {
    
    public static void time(){
        OUTER: 
                for(int chas = 0; chas<=23; chas++){
            System.out.println("Start outer loopa");
            INNER:
                    for(int minuta = 0; minuta<=59; minuta++){
                if (minuta ==2){
                    continue OUTER;
                }
                System.out.println(chas + ": " + minuta);
                   }
            System.out.println("Konec outer loopa");
        }
    }
    
    
    public static void main (String []args){
        
        time();
    }
    
    
    
    
}
