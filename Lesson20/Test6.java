
package Lesson20;

import java.util.*;
import java.util.Arrays;

public class Test6 {
    public static void main(String[]args) {
        StringBuilder sb1 = new StringBuilder ("A");
        StringBuilder sb2 = new StringBuilder ("B");
        StringBuilder sb3 = new StringBuilder ("C");
        ArrayList <StringBuilder> list1 = new ArrayList <> ();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
       
        /*ArrayList <StringBuilder> list2 = (ArrayList <StringBuilder>)list1.clone();
         System.out.println(list1.get(0) == list2.get(0));
        
        list1.get(0).append("!!!");
        list1.set(0, new StringBuilder ("D"));
        System.out.println (list2.get(0));
        */
        /*
        Object [] array1 = list1.toArray(); // вывод элементов массива
        for(Object o : array1){
            System.out.println (o);
        }
        */
        /*
        StringBuilder [] array2 = list1.toArray(new StringBuilder[10]); // выведет элементы массива и "null" вместо оставшихся свободных мест (т.к. указали размер массива 10)
        for(StringBuilder sb : array2){
            System.out.println (sb);
        }
        */
        StringBuilder [] array = {sb2, sb3, sb3, sb3};
        List <StringBuilder> list8 = Arrays.asList (array);
            System.out.println (list8);
        array[0].append("!!!"); // добавляет знаки в конец символа с индексом 0
            System.out.println (list8);
        array[0] = new StringBuilder("!!!"); // изменяет символ с индексом 0
            System.out.println (list8);
                
        
    }
}
