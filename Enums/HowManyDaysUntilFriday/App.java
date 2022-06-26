package Enums.HowManyDaysUntilFriday;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws UnsupportedDayOfWeekException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a day of the week: ");
        String dayInput = sc.nextLine();
        DayOfWeek day = DayOfWeek.valueOf(dayInput.toUpperCase(Locale.ROOT));
        int numOfDays = daysUntilFriday(day);

        // Print the result
        System.out.println("The remaining day(s) until Friday is: " + numOfDays);
    }

    public static int daysUntilFriday(DayOfWeek day) throws UnsupportedDayOfWeekException {
        switch (day) {
            case SUNDAY:
                return 5;
            case MONDAY:
                return 4;
            case TUESDAY:
                return 3;
            case WEDNESDAY:
                return 2;
            case THURSDAY:
                return 1;
            case FRIDAY:
                return 0;
            case SATURDAY:
                return 6;
            default:
                throw new UnsupportedDayOfWeekException("Error: Input is incorrect");
        }
    }
}
