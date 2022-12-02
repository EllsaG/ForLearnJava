
package Lesson20;

import java.util.*;

public class Test9 {
   public static void main(String[]args) {
       int [] array1 = {1,2,3,4,5};
       int [] array2 = {1,2,3,5};
       int [] array5 = {1,2,3,5};
       
       char [] array3 = {'p','r','i','v','e','t'};
       char [] array6 = {'p','r','i','v','e','t','o'};
       char [] array4 = {'p','r','i','v','i','v','k','a'};
       char [] array7 = null;
       
       System.out.println(Arrays.compare(array3, array7)); /*
       возвращает значение меньше нуля , если значение 1 меньше значения 2 (если брать в расчет условный словарь),
       в случае если значение 1 больше значения 2, то возвращает значение больше нуля
       в случае если начения равнты, то возвращает "0"
       */
       
       System.out.println(Arrays.mismatch(array1, array5)); /* находит индекс первого рас[ождения массивов
       или выводит "-1" если они одинаковые
       */
       
       
       
       
       
       
   } 
    
    
    
}
