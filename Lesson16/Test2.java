
package Lesson16;

public class Test2 {
 
    
    public static void main (String[]args){
        
 
        
        
        
        
        String s1 = new String ("privet");
        
        
        // в ' ' пишется тип данных char, в пишется тип данных " " String
        
        
        String s10 = s1.substring(3); // индекс начиная с которого выводится фраза
        System.out.println(s10);

        String s11 = s1.substring(3,4); // индекс начиная с которого выводится фраза и индекс до которого он дойдет  
        System.out.println(s11);        
        
        String s12 = s1.trim(); // убирает пробелы по бокам от слова, но оставляет промежуточные
        System.out.println(s12);
        
        String s13 = s1.substring(3,5); 
        System.out.println(s13);
        
        String s14 = s1.replace('r','Z'); // указывает какой char на какой нужно поменять
        System.out.println(s14);
        
        String s15 = s1.replace("vet","vivka"); // указывает какой String на какой нужно поменять
        System.out.println(s15);
        
        String s2 = "poka";
        String s3 = s2.replace('k', 'k');
        System.out.println(s2==s3);  // выдает  true  только с char
        
        String s5 = "privet,";
        String s6 = "drug";
        System.out.println(s5.concat(s6));// заменяет знак контектонации
    
       
      
       
       
       
       
       
       
       
       
       
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
