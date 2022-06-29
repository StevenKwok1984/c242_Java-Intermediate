package BigDecimal.Calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class InterestCalculator {

    public void calculating() {

        BigDecimal investAmount = readValue("How much do you want to invest? ");
        BigDecimal year = readValue("How many years are investing? ");
        BigDecimal interestRate = readValue("What is the annual interest rate % growth? ");

        bannerOfCalculating();

        for (BigDecimal i = BigDecimal.ONE; i.compareTo(year) <= 0; i = i.add(BigDecimal.ONE)) {

            System.out.println("Year "+ i +":");
            BigDecimal showInvestAmount = investAmount;
            System.out.println("Began with $" +showInvestAmount);

            // amount earned
            BigDecimal currentBalance = investAmount;

            currentBalance = getQuarterBalance(currentBalance, interestRate);

            BigDecimal earn = currentBalance.subtract(investAmount);
            System.out.println("Earned " + (earn));
            // Ended with
            //currentBalance = newBalance;
            investAmount = investAmount.add(earn);
            System.out.println("Ended with " + investAmount);
            System.out.println();
        }

    }

    public static BigDecimal readValue(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        BigDecimal number = sc.nextBigDecimal();
        return number;
    }

    public static void bannerOfCalculating() {
        System.out.println();
        System.out.println("Calculating...");
    }

    public static BigDecimal getQuarterBalance(BigDecimal currentBalance, BigDecimal interestRate) {
        // number for the for() loop
        BigDecimal end = BigDecimal.valueOf(4);
        for (BigDecimal j = BigDecimal.ZERO; j.compareTo(end) < 0; j=j.add(BigDecimal.ONE)){

            /*
            Entire Formula
             */
            // for quartered rate
            BigDecimal forDivide = BigDecimal.valueOf(4);
            BigDecimal quarterRate = interestRate.divide(forDivide, 4, RoundingMode.HALF_EVEN);
            // for creating percentage
            BigDecimal percent = BigDecimal.valueOf(100);
            BigDecimal quarterRatePercentage = quarterRate.divide(percent, 4, RoundingMode.HALF_EVEN);
            // for + 1
            BigDecimal qRPercentagePlusOne = quarterRatePercentage.add(BigDecimal.ONE);

            // Final formula
            BigDecimal newBalance = currentBalance.multiply(qRPercentagePlusOne);
            currentBalance = newBalance;
        }

        return currentBalance;
    }



}
