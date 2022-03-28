package hexlet.code;

public class Utils {

    static final int MULTIPLIER_FOR_SINGLE_DIGIT = 10;
    static final int MULTIPLIER_FOR_TWO_DIGIT = 100;

    public static int getRandomSingleDigit() {
        return (int) (Math.random() * MULTIPLIER_FOR_SINGLE_DIGIT);
    }

    public static int getRandomTwoDigit() {
        return (int) (Math.random() * MULTIPLIER_FOR_TWO_DIGIT);
    }

    public static char getRandomSign(char[] signs) {
        int num = (int) (Math.random() * signs.length);

        return signs[num];
    }

    public static int getRandomNumInRange(int begin, int end) {
        return begin + (int) (Math.random() * end);
    }
}
