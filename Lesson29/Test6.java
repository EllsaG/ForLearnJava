package Lesson29;

import java.time.*;
import java.time.format.*;

public class Test6 {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDateTime ldt = LocalDateTime.of(2016, Month.SEPTEMBER, 1, 16, 40, 9);
        LocalTime lt = LocalTime.of(16, 40);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date1 = LocalDate.parse("01 02 2015", f);
        System.out.println(date1);

//        System.out.println(ldt.getDayOfWeek());
//        System.out.println(ldt.getDayOfMonth());
//        System.out.println(ldt.getDayOfYear());
//        System.out.println(ldt.getMonthValue());
//        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
//        System.out.println(ld);
//        System.out.println(ld.format(d1));
//        
//        DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_TIME;
//        System.out.println(lt);
//        System.out.println(lt.format(d2));
//        
//        DateTimeFormatter d3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
//        System.out.println(ldt);
//        System.out.println(ldt.format(d3));
//        System.out.println(ldt);
//        System.out.println(ldt.format(f));
    }
}
