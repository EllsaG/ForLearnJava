
package Lesson20.ArrayListMethods;

import java.util.*;

public class Test3 {
    public static void main(String[]args) {
        ArrayList <String> al1 = new ArrayList <> ();
        al1.add ("one");
        al1.add ("two");
        al1.add ("three");
        al1.add ("four");
        al1.add ("five");
        System.out.println ("all = " + al1);
        
        List <String> list = List.of("odin","dva","tri"); // создает лист, но его нельзя изменять
        System.out.println ("list = " + list);
        
        List <String> list2 = List.copyOf(al1); /* создает лист, который принимает в себя существующую коллекцию
        и этот лист тоже нельзя изменят
        */
        System.out.println ("list2 = " + list2);
        
        
        
        
    }
}
