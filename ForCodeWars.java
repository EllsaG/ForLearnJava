import java.util.*;

public class ForCodeWars {    
    
    public static String smash(String... words) {
        // TODO Write your code below this comment please
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<words.length; i++){
            sb.append(words [i]);
            if (i<words.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();        
    }
        

//       hello world this is great


    public static void main(String[]args) {
        String [] array = {"hello","world","this","is","great"};
        
        System.out.println (smash(array));
        
        
        
        
        
        
        
    }
}
