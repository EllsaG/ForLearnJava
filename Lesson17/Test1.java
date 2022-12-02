
package Lesson17;
class Car{}

public class Test1 {
    public static void main (String[]args){
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good Day!!!");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb3);
        
        System.out.println(sb2.length());
        System.out.println(sb2.charAt(4));
        System.out.println(sb2.indexOf("o",2)); // в параметре у стрингбилдера стринг вместо чара как у стрринга
        String s = sb2.substring(5); // на выходе дает стринг
        System.out.println(s);
        String s2 = sb2.substring(5, 8);
        System.out.println(s);
        
        System.out.println(sb2.subSequence(5, 8)); // выводит такой же как сабстригн, но берет последовательность символов т.е. последовательность чаров
        
//        sb2.append(22); // в конец стрингбилдера добавляет еще что-то (надпись, число и тд любых типов данных)
//        System.out.println(sb2);
//        sb2.append(true);
//        System.out.println(sb2);
//        sb2.append(sb2);
//        System.out.println(sb2);
//        sb2.append("hello");
//        System.out.println(sb2);
//        sb2.append(new Car());
//        System.out.println(sb2);
        
        System.out.println(sb2.insert(sb2.length(), "Hello"));
        
        StringBuilder sb10 = new StringBuilder("Hello World");
//        sb10.delete(3, 6);
//        System.out.println(sb10);
        sb10.deleteCharAt(6);
        System.out.println(sb10);
        
        sb10.reverse();
        System.out.println(sb10);
        
        StringBuilder sb12 = new StringBuilder("Vsem privet");
        sb12.replace(0, 4, "Pete"); // меняет участок от (какой-то позиции) до (какой-то позиции) на указаный стринг
        System.out.println(sb12);
        
        System.out.println(sb1.capacity());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
}
