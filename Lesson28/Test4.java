
package Lesson28;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;


public class Test4 {

    static void smenaDejurnogo(LocalDate nachalo, LocalDate konec, Period p) {
        LocalDate data = nachalo;
        while (data.isBefore(konec)) {
            System.out.printlSn("Nastupila data " + data + ". Pora menyat dejurnogo");
            data = data.plus(p);
        }
    }
    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDate konec = LocalDate.of(2017, Month.MAY, 31);
        Period p = Period.of(1);
        
        smenaDejurnogo(nachalo,konec,p);
    }
}
