
package Lesson22HomeWork;

public class SA {
}
class ShowAnimals {
     int eyes;
    ShowAnimals(){        
        System.out.println ("I am animal");
    }
    void eat(){
        System.out.println ("Animal eats");
    }
    void drink(){
        System.out.println ("Animal drinks");
    }
}

class Pet extends ShowAnimals{
    String name;
    int tail = 1;
    int pow = 4;
    Pet(){
        eyes = 2;
        System.out.println ("I am pet");
    }
     void run(){
        System.out.println ("Pet runs");
    }
     void jump(){
        System.out.println ("Pet jumps");
    }        
}   

class Dog extends Pet {
    Dog (String name){
        this.name = name;
        System.out.println ("I am dog and my name is: " + name); 
    }
    void play(){
        System.out.println ("Dog plays");
    }
}

class Cat extends Pet {
    Cat (String name){
        this.name = name;
        System.out.println ("I am cat and my name is: " + name); 
    }
    void sleep(){
        System.out.println ("Cat sleeps");
    }
}

class Test{
    public static void main (String [] args){
        Dog dog = new Dog ("Sharic");
        System.out.println (dog.pow);
        System.out.println ();
        Cat cat = new Cat ("Bublic");
        cat.sleep();      
    }
}