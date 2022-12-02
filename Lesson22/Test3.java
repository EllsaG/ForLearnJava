
package Lesson22;

public class Test3 {
    public static void main (String []args){
        Doctor doc = new Doctor ();
        doc.name = "Ivan";
        doc.age = 50;
        doc.experience = 25;
        doc.eat();
        doc.specializaciay = "xirurg";
        doc.sleep();
        doc.lechit();
        
        
    }
}
class Employee{
    String name;
    int age;
    int experience;
    void eat (){System.out.println("Kushat");}
    void sleep (){System.out.println("Spat");}    
}

class Doctor extends Employee {    
    String specializaciay;    
    void lechit (){System.out.println("Lechit");}     
}

class Teacher extends Employee {    
    String specializaciay;    
    void uchit (){System.out.println("Uchit");}   
}

class Driver extends Employee {    
    String specializaciay;
    void vodit (){System.out.println("Vodit");}   
}