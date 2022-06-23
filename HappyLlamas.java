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
}
