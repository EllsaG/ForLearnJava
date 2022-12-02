
package Lesson19;

public class Test8 {
    public static void main(String [] args) {
        int [] array = new int [4];
        for (int b:array){ // нельзя проводить динамическую инициализацию массива
            b = 10;
        }
        
        for (int a:array){
            System.out.print (a+ " ");
        }
        
        
        
        
    }
}
