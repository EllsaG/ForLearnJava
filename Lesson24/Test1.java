/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson24;

/**
 *
 * @author Vegas
 */
public class Test1 {
        public static void main (String [] args){
        Figura f1 = new Kvadrat();
        System.out.println (f1.kolichestvoStoron);
        f1.ploshad();
        
        
    }
}

abstract class Figura {

    int kolichestvoStoron = 0;

    abstract void perimetr();

    abstract void ploshad();

    void showInfo() {
        System.out.println("Eto figura");
    }
}

class Kvadrat extends Figura {

    int kolichestvoStoron = 4;
    int storona1 = 10;

    public void perimetr() {
        System.out.println("Perimetr kvadrata = " + 4 * storona1);
    }

    public void ploshad() {
        System.out.println("Ploshad kvadrata = " + storona1 * storona1);
    }
}

class Pryamougolnik extends Figura {
        
    int kolichestvoStoron = 4;
    int storona1 = 8;
    int storona2 = 5;
    public void perimetr() {
        System.out.println("Perimetr Pryamougolnika = " + 2 * (storona1+storona2));
    }

    public void ploshad() {
        System.out.println("Ploshad Pryamougolnika = " + storona1 * storona2);
    }
}

class Okrujnost extends Figura {
            
    int kolichestvoStoron = 0;
    int radius = 3;
    public void perimetr() {
        System.out.println("Perimetr Okrujnosti = " + 2 * 3.14 * radius);
    }

    public void ploshad() {
        System.out.println("Ploshad Okrujnosti = " + 3.14 * radius * radius);
    }
}

abstract class Chetirexugolnik extends Figura {

    void def() {
        System.out.println("eto Chetirexugolnik");
    }
}
