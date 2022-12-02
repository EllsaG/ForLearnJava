
package Lesson25;

public class Test3 {
    public static void main(String[] args) {
        Help_able2 h = new Doctor2();
        Employee2 emp = new Doctor2 ();
        Employee2 emp1 = new Doctor2 ();
        Employee2 emp2 = new Teacher2 ();
        Employee2 emp3 = new Driver2 ();
        Employee2 e = new Employee2 ();
//        Doctor2 d1 = (Doctor2)emp1;
        
        h.help();
        ((Doctor2)emp).help();
        System.out.println(e==emp);
//        System.out.println(((Doctor2)h).specializaciay);
//        ((Doctor2)h).lechit();
        
    }
}

class Employee2{
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;
    void eat (){System.out.println("Kushat");}
    void sleep (){System.out.println("Spat");}    
}

class Doctor2 extends Employee2 implements Help_able2 {    
    String specializaciay = "xirurg";    
    public void help (){System.out.println("Doctor okazivaet pomosh");}
    void lechit (){System.out.println("Lechit");}     
}

class Teacher2 extends Employee2 {    
    int kolichestvoUchenikov;    
    void uchit (){System.out.println("Uchit");}   
}

class Driver2 extends Employee2 {    
    String nazvanieMashini = "Mercedes";
    void vodit (){System.out.println("Vodit");}   
}

interface Help_able2{
    void help();    
}