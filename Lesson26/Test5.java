package Lesson26;

public class Test5 {
    {
        System.out.println("Eto init blok 3");
    }

    Test5() {
        System.out.println("Eto konstuktor");
    }

    Test5(int a) {
        this();
        System.out.println("Eto konstuktor 2");
    }

    {
        System.out.println("Eto init blok 1");
    }

    static {
        System.out.println("Eto STATIC init blok 1");
    }

    {
        System.out.println("Eto init blok 2");
    }

    static {
        System.out.println("Eto STATIC init blok 2");
    }

    public static void main(String[] args) {
        Test5 t1 = new Test5();
        Test5 t2 = new Test5(3);

    }
    
}
