package Lesson29;

import java.time.*;

public class Test5 {

    public static void main(String[] args) {

        LocalDate nachalo = LocalDate.of(2016, Month.SEPTEMBER, 1);
        Period p = Period.ofDays(10);
        System.out.println(nachalo.plus(p));
        
        
        
        
    }
}
