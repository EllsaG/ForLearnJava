
package Lesson24;

public class Test4 {
    
}

interface I1{
    void abc ();
    default void def (){System.out.println("eto metod def");}
    
}

class Z2 implements I1 {
    public void abc (){System.out.println("eto metod abc");}
    
}