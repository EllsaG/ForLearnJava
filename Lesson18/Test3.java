
package Lesson18;

public class Test3 {
    static String s;
    public static void main (String[]args){
        // int [] array = new int [-3]; // exeption - ошибка при задании длины массива
        int [] array = new int [3];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        // array[3]=5; // ArrayIndexOutOfBoundsExeption т.к. вышли за границу массива размером "3"
        
        // int  [][]array2 = new int [3][];
        // System.out.println (array2[0][1]); //  NullPointerException т.к. размер одномерных массивов задан, но они пустые т.е. их значение "null"
        
        int  [][]array2 = new int [3][];
        System.out.println (s.length()); // NullPointerException т.к.переменная "s" ничего в себе не содержит, а у значения "null" нет длины
        
        
        
        
    }
}
