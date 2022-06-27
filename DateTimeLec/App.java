package DateTimeLec;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;


public class App {

    public static void main(String[] args) {
        // LocalDate ld = LocalDate.now();

        //ld = LocalDate.parse("2015-01-01");

        // ld = LocalDate.parse("02/07/2010", DateTimeFormatter.ofPattern("MM/dd/yyyy"));



        // Calculating the Time Between Two Dates
        // Period diff = ld.until(past);

        /*

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate ld = LocalDate.parse("02/07/2010", formatter);
        String formatted = ld.format(formatter);

        formatted = ld.format(DateTimeFormatter.ofPattern("MM=dd=yyyy+=+=+="));

        LocalDate past = ld.minusDays(8);

        formatted = past.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));

        System.out.println(formatted);
System.out.println(formatted);
         */


        // Working with Legacy Dates
        LocalDate ld;
        Date legacyDate = new Date();
        ZonedDateTime zdt = ZonedDateTime.ofInstant(
                legacyDate.toInstant(), ZoneId.systemDefault());
        ld = zdt.toLocalDate();
        System.out.println(ld);

    }
}
