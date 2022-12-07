import java.util.*;

public class ForCodeWars {    
    
    public static boolean isIsogram(String str) {
        String s = new String (str);        
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder(s); 
        boolean b = true;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.indexOf(sb.substring(i, i + 1)) != sb.lastIndexOf(sb.substring(i, i + 1))) {
                b = false;
            }
        }
        return b;
    }
//    isIsogram "dermatoglyphics" = true
//    isIsogram "moose" = false
//    isIsogram "aba" = false


//       hello world this is great


    public static void main(String[]args) {
        String s = "moOse"; // true 
        String s2 = "16";
        

        System.out.println (isIsogram ("moOse"));
        
//        System.out.println (s.toUpperCase());
        
        
        
        
    }
}
