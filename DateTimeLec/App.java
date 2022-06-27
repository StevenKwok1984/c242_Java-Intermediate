package DateTimeLec;

import java.time.*;
import java.time.format.DateTimeFormatter;


public class App {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();

        ld = LocalDate.parse("2015-01-01");

        ld = LocalDate.parse("02/07/2010", DateTimeFormatter.ofPattern("MM/dd/yyyy"));

        LocalDate past = ld.minusDays(8);

        // Calculating the Time Between Two Dates
        Period diff = ld.until(past);

        System.out.println(diff);


    }
}
