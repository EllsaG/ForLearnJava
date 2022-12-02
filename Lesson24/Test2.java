
package Lesson24;


public class Test2 {
    public static void main (String [] args){
        Help_able h = new Driver ();
        h.tushitPojar("wwww");
        
        
    }
}

class Employee {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;
    void eat() {
        System.out.println("Kushat");
    }
    void sleep() {
        System.out.println("Spat");
    }
}

class Teacher extends Employee implements Help_able{    
    int kolichestrvoUchenikov;    
    void uchit (){System.out.println("Uchit");}  
    public void pomosh (){System.out.println("Uchitel okazivaet pomosh");}
    public void tushitPojar (String s){System.out.println("Uchitel tushit pojar s pomosh " + s);}
}

class Driver extends Employee implements Help_able, Swim_able {    
    String nazvanieMashini;
    void vodit (){System.out.println("Vodit");} 
    public void pomosh (){System.out.println("Voditel okazivaet pomosh");}
    public void tushitPojar (String s){System.out.println("Voditel tushit pojar s pomosh " + s);}
    public void swim (){System.out.println("Voditel mojet plavat");}
}

interface Help_able {
    void pomosh ();
    void tushitPojar (String predmet);
    
}

interface Swim_able {
    void swim ();
    
}