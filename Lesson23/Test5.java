
package Lesson23;

public class Test5 {
    public static void main (String [] args){
        Employee2 emp = new Employee2 ();
        Teacher2 t2 = new Teacher2();
        t2.sleep();
        Employee2 e2 = new Teacher2 ();
        e2.sleep();
    }
}
class Employee2 {
    
    double salary = 100;
    String name = "Kolya";  
    
    public Eda eat (){
        System.out.println("Kushaet rabotnik");
        Eda e = new Eda();
        return e;
    }
    
    private void sleep (){
        System.out.println("Spit rabotnic");
    }    
}


class Teacher2 extends Employee2 { 
    
    public Eda eat (){
        System.out.println("Spit uchitel");
        Frukti f = new Frukti();
        return f;
    }
    
    int kolichestvoUchenikov;    
    
    void uchit (){
        System.out.println("Uchit");
    }   
    
    public void sleep (){
        System.out.println("Spit UCHITEL");
    }
}