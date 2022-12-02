
package Lesson18;

public class Test7 {
    public static void main (String[]args){
        char [] array = {'p','r','i','v','e','t'};
//        String s = new String (array);
//        System.out.println (s);
        StringBuilder sb = new StringBuilder ("Hello World");
        // sb.append(array, 2, 3); //  добавляет в конец массив из 3-х чаров со 2-го индекса 
        sb.insert(2, array, 1, 3);//  добавляет массив на позицию 2 в значении стрингбилдера из 3-х чаров с 1-го индекса 
        System.out.println (sb);    
        
        
    }
    
    
}
