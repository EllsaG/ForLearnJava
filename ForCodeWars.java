import java.util.*;

public class ForCodeWars {    
    
    public static int nbDig(int n, int d) {
        String[] str = new String[n + 1];
        int nd = 0;
        for (int i = 0; i < str.length; i++) {
            str[i] = String.valueOf(i * i);
            for (int j = 0; j < str[i].length(); j++) {
                if (str[i].substring(j, (j + 1)).contains(String.valueOf(d))) {
                    nd++;
                }
            }
        }
        return nd;
    }
    


//       hello world this is great


    public static void main(String[]args) {
        String s = "16";

        System.out.println (nbDig(25,1));
        
        
        
        
        
        
        
    }
}
