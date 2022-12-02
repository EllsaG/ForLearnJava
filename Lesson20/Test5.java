
package Lesson20;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[]args) {
        ArrayList <String> list = new ArrayList <> ();
        list.add(new String ("poka"));
        list.add(new String ("privet"));
        list.add(new String ("ok"));
        list.add(new String ("poka"));
        list.add(new String ("hello"));
        for (String s:list){
            System.out.print(s + " ");
        }
        System.out.println(list.indexOf(new String ("poka"))); /* указанный объект будет найден т.к. это String
        но выдается индекс первого совпадения        
        */
        System.out.println(list.lastIndexOf(new String ("poka"))); /* указанный объект будет найден т.к. это String
        и он выдает индекс последнего совпадения        
        */
        System.out.println (list.size()); // показывает размера листа
        System.out.println (list.isEmpty()); // показывает пустой лист или нет 
        
        System.out.println (list.contains("poka")); // показывает есть ли в массиве значение указанное в скобках
        
        
        
        
    }
    
}
