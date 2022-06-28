package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class App {
    public static void main(String[] args) {
        // String Constructor, Default Scale
        BigDecimal a = new BigDecimal("42.35");

        // System.out.println(a);

        // Setting Scale Without Rounding Mode
        // BigDecimal b = a.setScale(1); // ERROR

        // Setting Scale With Rounding Mode HALF_UP
        BigDecimal b = a.setScale(1, RoundingMode.HALF_UP);
        System.out.println(b.toString()); // 42.2

        // Setting Scale With Rounding Mode HALF_DOWN
        b = a.setScale(1, RoundingMode.HALF_DOWN);
        System.out.println(b.toString()); // 42.3

        // Division With No Rounding Mode
        BigDecimal op1 = new BigDecimal("10");
        BigDecimal op2 = new BigDecimal("6");
        // BigDecimal c = op1.divide(op2);

        // Division with Various Rounding Modes



    }
}
