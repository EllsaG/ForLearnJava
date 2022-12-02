
package Lesson20.ArrayListMethods;

import java.util.*;

public class Test1 {
    public static void main(String[]args) {
        ArrayList <String> al1 = new ArrayList <> ();
        al1.add ("one");
        al1.add ("two");
        al1.add ("three");
        al1.add ("four");
        al1.add ("five");
        System.out.println ("all = " + al1);
        
        ArrayList <String> al2 = new ArrayList <> ();
        al2.add ("one");        
        al2.add ("three");
        al2.add ("four");
        al2.add ("ten");
               
        /* al1.removeAll (al2); /* метод используется для того чтобы из одного массива
        удалисть то, что содержится во втором массиве        
        */
        System.out.println ("all = " + al1);
        
        al1.retainAll (al2);/* метод сравнивает элементы массива 1 и массива 2,
         в первом массиве останутся те элементы, которые совпадают в обоих массивах,
        а остальные удалятся        
        */        
        System.out.println ("all = " + al1);
        
        boolean result = al1.containsAll(al2); // содержатся ли в массиве 1 все элементы массива 2 (true или false)
        System.out.println ("result = " + result);
        
        
        
        
        
        
        
        
    }
}
