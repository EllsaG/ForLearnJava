
package Lesson22;

public class Human {
   
    protected String name = "Kolya";

    protected static int salary = 150;
    
    protected void work(){ 
        System.out.println("Rabotat");
    }
    protected static void rest(){ 
        System.out.println("Otdixat");
    }  
}

class Student extends Human{
    public static void main (String []args){
        Student s = new Student ();
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }
    
}