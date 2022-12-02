
package Lesson16;

public class Test11 {
    public static void main (String[]args){ 
        String s1 = "privet";  
            System.out.println(s1.isBlank()); // true если стринг состоит из пробела, таба и прочего подобного, false если кроме подобных символов есть другие символы
        String s2 = "            ";  
            System.out.println(s2.isBlank()); // true если стринг состоит из пробела, таба и прочего подобного, false если кроме подобных символов есть другие символы
        
        String s3 = " ";
            System.out.println(s2.isEmpty()); // true если стринг пустой (даже без пробелов, табов и прочего)
            
        String s4 = "  privet            ";
            System.out.println(s4.strip());  // как и метод trim() удаляет пробелы и табы в начале и конце  
            System.out.println(s4.stripLeading());  // удаляет пробелы и табы в начале
            System.out.println(s4.stripTrailing());  // удаляет пробелы и табы в конце
            
        String s5 = "poka";    
        String s6 = s5.strip();
        System.out.println(s5 == s6);
    }
}
