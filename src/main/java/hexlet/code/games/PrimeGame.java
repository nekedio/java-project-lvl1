package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class PrimeGame {
    static final String RULES_GAME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void start() {
        String[][] data = PrimeGame.getData(Engine.COUNT_SET);
        Engine.startGame(RULES_GAME, data);
    }

    public static String[][] getData(int countSet) {
        String[][] result = new String[countSet][2];

        for (int i = 0; i < countSet; i++) {
            int num = 2 + Utils.getRandomTwoDigit();
            result[i][0] = Integer.toString(num);
            result[i][1] = isPrime(num) ? "yes" : "no";
        }

        return result;
    }

    private static boolean isPrime(int num) {
        int i = num - 1;
        while (i > 1) {
            if (num % i == 0) {
                return false;
            }
            i--;
        }
        return true;
    }
}
