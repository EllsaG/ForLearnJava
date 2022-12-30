package Lesson30Chapter2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test2 {

    public static void main(String[] args) {
        List<String> list = List.of("privet", "poka", "kak dela?", "vse normalno!");
        for (String s : list) {
            Predicate <String> p = z -> z.length()>4;
            System.out.println(s);
        }
        
        
        

//        for (String s : list) {
//            System.out.println(s);
//        }
//        list.forEach(s -> System.out.println(s));
//        
//        ArrayList <Integer> a1 = new ArrayList <> ();
//        a1.add(2);
//        a1.add(6);
//        a1.add(4);
//        a1.add(5);
//        a1.add(3);
//        a1.add(7);
//        a1.add(1);
//        
//        //a1.removeIf(element -> element%3 == 0);
////        Predicate <Integer> p = element -> element % 3 == 0;
////        a1.removeIf(p);
//        
//        System.out.println(a1);
//        a1.sort((x, y) -> -x.compareTo(y));
//        System.out.println(a1);
    }
}
