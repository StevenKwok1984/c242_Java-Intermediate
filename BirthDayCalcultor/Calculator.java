package BirthDayCalcultor;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Calculator {

    public void calculate() {

        // Opening
        System.out.println("Welcome to the Magical BirthDAY Calculator!");
        System.out.println();

        // Asking input
        LocalDate birthDay = readInput("What's your birthday?");

        // Show Day of week of your birthday
        DayOfWeek dayWeekBirth = getDayOfWeek(birthDay);
        System.out.println("That's means you were born on a " + dayWeekBirth);

        // Show same day of this year
        LocalDate sameDate = birthDay.withYear(2022);
        DayOfWeek sameDayWeek = getDayOfWeek(sameDate);
        System.out.println("This year it falls on a " + sameDayWeek + "...");

        // next Birthday
        LocalDate today = LocalDate.now();
        LocalDate nextBirthday = birthDay.withYear(today.getYear());
        String parsedToday = reformatting(today);
        //If your birthday has occurred this year already, add 1 to the year.
        if (nextBirthday.isBefore(today) || nextBirthday.isEqual(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }
        // Period diff = today.until(nextBirthday);
        long daysUntilBD = ChronoUnit.DAYS.between(today, nextBirthday);
        System.out.println("And since today is "+ parsedToday + ", there's only "+ daysUntilBD +" more days until the next one!");

        // Age after Birthday;
        Period period = Period.between(birthDay, nextBirthday);
        int nextAge = period.getYears();
        System.out.println("Bet yer excited to be turning " + nextAge + "!");

    }


    public static LocalDate readInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = formatting();

        System.out.println(prompt);
        String stringDay = sc.nextLine();
        LocalDate date = LocalDate.parse(stringDay, formatter);
        return date;
    }

    public static DayOfWeek getDayOfWeek(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek;
    }

    /*
    public static LocalDate getToday() {
        LocalDate today = LocalDate.now();
        LocalDate parsedToday = reformatting(today);
        return parsedToday;
    }

     */


    public static String reformatting(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String parsedDate = date.format(formatter);
        return parsedDate;
    }





    public static DateTimeFormatter formatting(){
        return DateTimeFormatter.ofPattern("MM-dd-yyyy");
    }


}
