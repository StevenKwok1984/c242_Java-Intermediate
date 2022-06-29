package BigDecimal.Calculator;

import java.util.Scanner;

public class InterestCalculator {

    public void calculating() {

        float investAmount = readValue("How much do you want to invest? ");
        float year = readValue("How many years are investing? ");
        float interestRate = readValue("What is the annual interest rate % growth? ");

        bannerOfCalculating();

        for (int i = 1; i <= year; i ++) {

            System.out.println("Year "+ i +":");
            System.out.println("Began with $" + investAmount);

            // amount earned
            float currentBalance = investAmount;

            currentBalance = getQuarterBalance(currentBalance, interestRate);

            float earn = currentBalance - investAmount;
            System.out.println("Earned " + (earn));
            // Ended with
            //currentBalance = newBalance;
            investAmount += earn;
            System.out.println("Ended with " + investAmount);
            System.out.println();
        }

    }

    public static float readValue(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        String stringNum = sc.nextLine();
        float number = Float.parseFloat(stringNum);
        return number;
    }

    public static void bannerOfCalculating() {
        System.out.println();
        System.out.println("Calculating...");
    }

    public static float getQuarterBalance(float currentBalance, float interestRate) {
        for (int j = 0; j < 4; j++){
            float newBalance = currentBalance * (1 + ((interestRate / 4) / 100));
            currentBalance = newBalance;
        }

        return currentBalance;
    }



}
