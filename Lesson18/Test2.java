
package Lesson18;

public class Test2 {
    public static void main (String[]args){

        int [] array, a; // значит и "array" и "a" - массивы
        int b [], c; // значит "b" является массивом типа int, а "c" переменная типа int
        c = 5;
        int [] d , e [][]; // значит "d"- одномерный массив, а "e" - трехмерный
        //int d [], e [][]; // в этом случае значит "d"- одномерный массив, а "e" - двумерный
        String [] array1;;
        int [][] array2;
        int [][] array20 [][]; // можно бъявлять массивы и так

        array1 = new String [3];
        array2 = new int [3][];
        
        for (int i=0; i<array1.length; i++){
            array1[i] = "privet" + i;
            System.out.println (array1[i]);            
        }
        
        array2[0] = new int [5];
        array2[1] = new int [2];
        array2[2] = new int [7];
        
        for (int i=0; i<array2.length; i++){
            for (int j=0; j<array2[i].length; j++){
                array2[i][j] = i + j;
                
                System.out.println (array2[i][j]);
                
            }            
        }
        
    }

}
