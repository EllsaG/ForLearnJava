
package Lesson30Chapter2;

import java.util.ArrayList;

public class Test1 {
//    var v =10;
    public static void main(String [] args) {
        var tit = new TestInferenceType();
        var i = 10;
        var w = 1.5f;
        var array = new String [] {"a","b"};
        var result = abc();
        Object obj1 = "privet";
        var obj2 = obj1;
        ArrayList <String> a1 = new ArrayList <> ();
        for(var s : a1){System.out.println(s);}
        
    }
    static double abc(){return 3.14;}
}

class TestInferenceType {
    
}

interface I{
    void abc();
    
    default void def(){}
    default void def2(){}
    static void def3(){}
}