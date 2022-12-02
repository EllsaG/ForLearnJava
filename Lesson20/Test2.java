
package Lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[]args) {
        ArrayList <String> list = new ArrayList <> ();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add(1,"hello");
        for (String s:list){
            System.out.print(s + " ");
        }
        // System.out.println(list.get(3)); // возвращает элемент на который указывает индекс
            System.out.println();
        // list.remove("poka");// удаляет значение  указанного значения
        /* list.remove(new String ("poka")); удаляет значение  указанного объекта(со стрингом)
        можно казывать новый объект т.к. он плзволяет сравнивать значения этих лобъектов через метод equals)
        */
        // list.set(1, "!!!"); // заменяет имеющийся элемент под указаным индексом на другой
        
        ArrayList <String> list2 = new ArrayList <> ();
        list2.add ("Petrov");
        list2.add ("Sidorov");
        list.addAll(list2); // добавляет в конец указанный массив, но только типа данных пренадлежащего этому массиву
        // list.addAll(1,list2); // добавляет массив после указанного индекса, но только типа данных пренадлежащего этому массиву
        
        for (String s:list){
            System.out.print(s + " ");
        }
        // list2.set(1, "Ivanov"); // значение list не изментяся т.к. мизменяется только значение list2
        System.out.println();
        for (String s:list){
            System.out.print(s + " ");
        }     
        
        
        
        
        
        
        
        ArrayList <StringBuilder> list3 = new ArrayList <> ();
        list3.add(new StringBuilder ("poka"));
        list3.add(new StringBuilder ("privet"));
        list3.add(new StringBuilder ("ok"));
        list3.add(1,new StringBuilder ("hello"));
        for (StringBuilder s:list3){
            System.out.print(s + " ");
        }
            System.out.println();
        
        ArrayList <StringBuilder> list4 = new ArrayList <> ();
        list4.add (new StringBuilder ("Petrov"));
        list4.add (new StringBuilder ("Sidorov"));
        list3.addAll(list4);
        for (StringBuilder s:list3){
            System.out.print(s + " ");
        }
        for (StringBuilder s:list3){
            System.out.print(s + " ");
        }
        list4.get(1).append("!"); /* добавляет в конец указанного значения
        другое указанное значение при этом меняется и list4 и list3 т.к. это StringBuilder
        и это значит, что оба листа ссылаются на один и тот же объект
        */
        System.out.println();
        for (StringBuilder s:list3){
            System.out.print(s + " ");
        }
        
        list.clear(); // отчищает лист 
        System.out.println();
        for (StringBuilder s:list3){
            System.out.print(s + " ");
        }        
        
        
        
        
        
        
        
        
        
        
    }


}
