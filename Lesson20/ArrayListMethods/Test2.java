
package Lesson20.ArrayListMethods;

import java.util.*;

public class Test2 {
    public static void main(String[]args) {
        ArrayList <String> al1 = new ArrayList <> ();
        al1.add ("one");
        al1.add ("two");
        al1.add ("three");
        al1.add ("four");
        al1.add ("five");
        System.out.println ("all = " + al1);
        
        List <String> sublist = al1.subList(1, 4); /* возвращает создает из имеющегося ArreyList его отрывок (subList)
        и возвращает его, но в виде "Листа", а не "АррейЛиста" и этот лист является 
        частью массива, а не отдельным самостоятельным элементом
        */
        
        System.out.println ("sublist = " + sublist);
        
        sublist.add ("ten"); /* добавляет указанное значение
        и в лист "sublist" и в массив "al1" (но на следующий 
        позицию индекса указанного при создании листа )        
        */
        
        System.out.println ("all = " + al1);
        System.out.println ("sublist = " + sublist);
        
        al1.add("million"); 
        System.out.println ("all = " + al1);
        /* System.out.println ("sublist = " + sublist); /* выдаст "ConcurrentModificationException" т.к. необходимо
        делать манипуляции с массивом только через "sublist" чтобы можно было потом вывести саблист        
        */
        
        Object [] array = al1.toArray(); /* превращает "ArrayList" в "Array" и возвращает массив типа "Oblect"
        и, в данном случае, все элементы арейлиста "al1" будут содержаться в массиве "array"
        */
        
        String [] array2 = al1.toArray(new String []{});/* превращает "ArrayList" в "Array" и возвращает массив типа "String"
        и, в данном случае, все элементы арейлиста "al1" будут содержаться в массиве "array2"
        */
        for (String s : array2){ //выводит массив типа "String"
            System.out.print (s + " ");
        }
        
        
        
        
        
        
        
    }
}
