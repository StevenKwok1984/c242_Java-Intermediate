package Quiz;

public class exception_handling {
    /*
    public static void main(String args[]) {
        try {
            int a, b;
            b = 0;
            a = 5 / b;
            System.out.print("A");
        } catch (ArithmeticException e) {
            System.out.print("B");
        }
    }


    public static void main(String args[]) {
        try {
            System.out.print("Hello" + " " + 1 / 0);
        } catch (ArithmeticException e) {
            System.out.print("World");
        }
    }

     */

    public static void main(String args[]) {
        try {
            int a, b;
            b = 0;
            a = 5 / b;
            System.out.print("A");
        } catch (ArithmeticException e) {
            System.out.print("B");
        } finally {
            System.out.print("C");
        }
    }
}
