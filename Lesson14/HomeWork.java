
package Lesson14;

public class HomeWork {
    
    public static void Vremia1 (){
        for(int chas = 0; chas<6; chas++) {
            for(int minuta = 1; minuta<60; minuta++){
                for(int sekunda = 1; sekunda<60; sekunda++){
                    System.out.println(chas + ": " + minuta + ": " + sekunda );
                }
            }            
        } 
    }
    public static void Vremia2 (){
        OUTER: 
        for(int chas = 0; chas<6; chas++) {
            MIDDLE: 
            for(int minuta = 0; minuta<60; minuta++){
                if (chas>1 && minuta%10==0){
                    break OUTER;
                }
                INNER: 
                for(int sekunda = 0; sekunda<60; sekunda++){
                    if (sekunda*chas>minuta){
                        continue MIDDLE;
                    }
                    System.out.println(chas + ": " + minuta + ": " + sekunda );
                }
            }            
        } 
    }
    
    
    public static void main (String []args){
      
       Vremia2(); 
    }
    
}
