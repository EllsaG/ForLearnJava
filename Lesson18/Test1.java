
package Lesson18;

public class Test1 {
    public static void main (String[]args){
        int [] array1;  // declaration - объявление массива
        String [] array2; // declaration - объявление массива
        double [][] array3; // declaration - объявление массива
        int [][] array10; // declaration - объявление массива
        double [] array7; // declaration - объявление массива
        
        // array1 = new int [-3]; // allocation - указание рамера массив
        array2 = new String [3]; // allocation - указание рамера массив
        array3 = new double [4][2]; // allocation - указание рамера массив
        array10 = new int [4][2]; // allocation - указание рамера массив
        array7 = new double [2]; // allocation - указание рамера массив
         
        array2 [0]= "privet"; // объявление значения по указанному индексу
        array2 [1]= "poka"; // объявление значения по указанному индексу
        array2 [2]= "ok"; // объявление значения по указанному индексу
        
        array3 [0][0] = 3.14; // объявление значения по указанному индексу
        array3 [2][1] = 3.14; // объявление значения по указанному индексу
        
        double [] array5;
        array5 = new double [2];
        array5[0] = 2.5;
        array5[0] = 3.5;
        array7 = array5;
        
        array3 [1] = array5;
        System.out.println (array3 [1][0]);
        
        
        
        
        
        
        
        
    }
}
