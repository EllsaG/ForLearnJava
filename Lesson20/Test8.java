
package Lesson20;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Iterator; /* используется для того чтобы
можно было удалить элемент массива
*/

public class Test8 {
    public static void main(String[]args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        
        ArrayList <String> list1 = new ArrayList <> ();
        list1.add(s3);
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);
        
        Iterator <String> it = list1.iterator(); // выдает все элементы массива
        while (it.hasNext()){ // параметр цикла узнает, есть ли следующий элемент в массиве
            System.out.println (it.next());// последовательно выводит все элементы массива
        }
        while (it.hasNext()){ // параметр цикла узнает, есть ли следующий элемент в массиве
            it.next();// последовательно выводит все элементы массива
            it.remove(); // используется для удаления одного или нескольких элементов массива
        }        
        
        
    }
}