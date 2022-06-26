package Enums;

import java.util.Scanner;

import static Enums.MathOperator.*;



public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int operand1, operand2;
        MathOperator operator = null;

        System.out.println("Welcome to the int Calculator, \n" +
                            "Select the operator\n" +
                            "1) PLUS \n" +
                            "2) MINUS \n" +
                            "3) MULTIPLY \n" +
                            "4) DIVIDE");
        int operatorID = sc.nextInt();
        switch (operatorID) {
            case 1:
                operator = PLUS;
                break;
            case 2:
                operator = MINUS;
                break;
            case 3:
                operator = MULTIPLY;
                break;
            case 4:
                operator = DIVIDE;
                break;
            default:
                System.out.println("Error: input the correct operand: ");
                System.exit(0);
        }

        System.out.println("Enter the first number: ");
        operand1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        operand2 = sc.nextInt();

        int result = IntMath.calculate(operator, operand1, operand2);

        System.out.println("The answer of "+ operand1 + " " + operator + " " + operand2 + " is: " + result);


    }
}
