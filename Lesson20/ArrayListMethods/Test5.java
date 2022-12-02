
package Lesson20.ArrayListMethods;

import java.util.*;

public class Test5 {
    public static void main(String[]args) {
        Map <Integer, String> map = new HashMap<>(); /* создает массив в котором указывается 
key(порядковый номер(не индекс)) и value (значение принадлежащее этому "key")
*/
        map.put(777, "Ivanov Mikhail");
        map.put(778, "Tregulov Zaur");
        map.put(779, "Sidorova Mariya");
        map.put(780, "Petrov Petr");
        map.put(779, "Roberto Carlos");
        map.put(781, "Tregulov Zaur");
        map.remove(779); // данный метод удаляет значение массива, в скобках указывается его "key"
        System.out.println ("map = " + map);
    }
}
