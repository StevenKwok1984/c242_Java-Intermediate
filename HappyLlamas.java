import java.util.Scanner;

public class HappyLlamas {
    public static boolean areTheLlamasHappy(boolean ultraBouncy, int trampolines) {
        boolean happy;

        if (ultraBouncy) {
            if (trampolines >= 24) {
                happy = true;
            } else {
                happy = false;
            }
        }  else {
            if (trampolines >= 24 && trampolines <= 42) {
                happy = true;

            } else {
                happy = false;
            }
        }
        return happy;
    }

    public static class BirthDAYCalculator {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Opening
            System.out.println("Welcome to the Magical BirthDAY Calculator!");
            System.out.println();

            // Ask Birthday
            System.out.println("What's your birthday?");



            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }
}
