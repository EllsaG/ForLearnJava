
package Lesson16;

public class Test1 {
    public static void main (String[]args){
        String s1 = new String ("abcdefgabcd");
        
        
        // в ' ' пишется тип данных char, в пишется тип данных " " String
        
        
        int a = s1.length(); // длина массива       
        System.out.println(a);
        
        char c1 = s1.charAt(3); // символ находящийся вместо индекса (номера в скобках) в массиве (отсчет номера символов: 0,1,2,3,4 и т.д.)
        System.out.println(c1);
        
        int i1 = s1.indexOf('t'); // номер индекса к которому принажлежит данный символ
        System.out.println(i1);
        
        int i2 = s1.indexOf("vet"); // номер индекса с которого начинается данная часть слова
        System.out.println(i2);
        
        int i3 = s1.indexOf("Z"); 
        System.out.println(i3);
        
        int i4 = s1.indexOf("a",5); // номер индекса с которого начинается поиск заданного символа или части слова
        System.out.println(i4);
        
        boolean b1 = s1.startsWith("abc"); // начинается ли фраза с той, что написана в скобках
        System.out.println(b1);
        
        boolean b5 = s1.startsWith("abc", 7); // начинается ли фраза (с учетом начального номера индекса) с той, что написана в скобках
        System.out.println(b5);
        
        boolean b2 = s1.endsWith("cd"); // кончается ли фраза той, что написана в скобках
        System.out.println(b2);
        
        
        
        
    }
    
}
