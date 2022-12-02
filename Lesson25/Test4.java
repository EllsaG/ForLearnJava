
package Lesson25;

import Lesson25.*; /*
продолжение теста 3
пишу тут т.к. там мало места
*/
        
public class Test4 {
    public static void main(String[] args) {
        Employee2 emp1 = new Doctor2 ();
        Employee2 emp2 = new Teacher2 ();
        Employee2 emp3 = new Driver2 ();
        Employee2 emp4 = new Employee2 ();
        Employee2 [] array = {emp1, emp2, emp3, emp4};
        for (Employee2 e : array){
            if(e instanceof Driver2){
                System.out.println(((Driver2)e).nazvanieMashini);
                ((Driver2)e).vodit();
            }
            
        }
    
    }
}

