import java.util.Scanner;

public class App {
    /**
     * A method to determine if the provided trampolines will result in happy llamas.
     *
     * When llamas get together they like to bounce on trampolines.
     *
     * However, lla,s are very particular about the proper number of trampolines,
     * and are usually only happy if there are between 24 t42 (inclusive!).
     * This only changes if the trampolines are made of ultra-bouncey NASA fabric.
     * In those cases, while they still require at LEAST 24, the llamas figure
     * the more trampolines the better!
     *
     * return true if the llamas will be happy with their trampolines,
     * or false otherwise.
     *
     * @param ultraBouncy True if trampolines are made of UltraBouncy NASA fabric.
     * @param trampolines The number of trampolines
     * @return boolean indicating if the llams are happy
     */

    public static void main(String[] args) {
        int trampolines;
        boolean ultraBouncy;
        boolean keepGoing = true;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter number of trampolines: ");
            trampolines = sc.nextInt();

            System.out.println("Is it ultraBouncy? (true or false): ");
            ultraBouncy = sc.nextBoolean();

            // result
            boolean result = areTheLlamasHappy(ultraBouncy, trampolines);
            System.out.println("Are llamas happy? ");
            System.out.println(result);

            System.out.println("Want to continue? ");
            keepGoing = sc.nextBoolean();
            if (!keepGoing) {
                System.out.println("Thank you. ");
            }
        } while (keepGoing);

    }

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
}
