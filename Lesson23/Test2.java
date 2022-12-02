
package Lesson23;

public class Test2 {
    public static void main (String [] args){
        Doctor d = new Doctor ();
        Teacher t = new Teacher ();
        Driver dr = new Driver ();
        Employee e = new Employee ();
        
        Employee emp1 = new Doctor();
        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();
        Xirurg x = new Xirurg();
        Doctor d2 = new Xirurg();
        Employee emp4 = new Xirurg ();
        
        
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
    void lechit (){System.out.println("Lechit");}     
}
class Xirurg extends Doctor {
    String skalpel;
    void operaciya (){}
}

class Teacher extends Employee {    
    int kolichestvoUchenikov;    
    void uchit (){System.out.println("Uchit");}   
}

class Driver extends Employee {    
    String nazvanieMashini;
    void vodit (){System.out.println("Vodit");}   
}