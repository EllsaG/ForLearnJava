
package Lesson23;

public class Test3 {
    public static void main (String [] args){
        Employee1 e= new Employee1 ();
        Teacher1 t = new Teacher1 ();
        t.eat();
        e.eat();
        
    }
}
class Eda{  }
class Frukti extends Eda{    }

class Employee1 {
    
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;
    
    public Eda eat (){
        System.out.println("Kushaet rabotnik");
        Eda e = new Eda();
        return e;
    }
    
    void sleep (){
        System.out.println("Spat");
    }    
}


class Teacher1 extends Employee1 { 
    
    public Frukti eat (){
        System.out.println("Kushaet utitel");
        Frukti f = new Frukti();
        return f;
    }
    
    int kolichestvoUchenikov;    
    
    void uchit (){
        System.out.println("Uchit");
    }   
}

class A{
Employee objectCreation (){
    return new Employee();
}
}

class B extends A{
H objectCreation (){
    System.out.println ("ok");
    return new H();
}
}

class H extends Teacher{}