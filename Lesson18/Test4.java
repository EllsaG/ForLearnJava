
package Lesson18;

import java.util.Arrays;

public class Test4 {
    public static void main (String[]args){
        int array1 [] = {1, 9, 3, -8, 0, 5, 4, 1};
            for(int i = 0; i<array1.length; i++){ // выводит значения массива в читабельный вид
            System.out.print (array1[i] + " "); 
            }
            
            System.out.println ();
            
            Arrays.sort(array1); // сортирует значения массива от меньшего у кбольшему 
            for(int i = 0; i<array1.length; i++){
            System.out.print (array1[i] + " "); 
            }        
            
            System.out.println ();
            System.out.println (array1); // вывод в понятном виде не получится
            
            // int index1 = Arrays.binarySearch(array1, -8); // ищет индекс (в отсортированом массиве) который принадлежит к указанному значению в массиве. Если массив не отсортирован, то вывод будет случайным и его не возможно предсказать
            // System.out.println (index1); 
            
            // int index2 = Arrays.binarySearch(array1, 10); // ищет индекс который принадлежит к указанному данному в массиве
            // System.out.println (index2); //в случая если нет данного значения в массиве, то возвращает инедекс с отрицательным значением и уменьшает это значение на единицу
            
            
            
            
            
            
            
        
        
        
    }
    
}
