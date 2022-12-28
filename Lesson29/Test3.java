package Lesson29;

import java.time.*;

public class Test3 {

    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2014, 5, 31);
        LocalDate ld2 = LocalDate.of(2012,Month.JUNE,18);
        System.out.println(ld1.isAfter(ld2));
        System.out.println(ld1.isBefore(ld2));
        
        
        
    }
}
