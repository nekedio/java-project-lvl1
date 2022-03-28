package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GcdGame {

    static final String RULES_GAME = "Find the greatest common divisor of given numbers.";

    public static void start() {
        String[][] data = GcdGame.getData(Engine.COUNT_SET);
        Engine.startGame(RULES_GAME, data);
    }

    public static String[][] getData(int countSet) {
        String[][] result = new String[countSet][2];

        for (int i = 0; i < countSet; i++) {
            int num1 = Utils.getRandomSingleDigit();
            int num2 = Utils.getRandomSingleDigit();
            result[i][0] = num1 + " " + num2;
            result[i][1] = getGcd(num1, num2);
        }

        return result;
    }

    public static String getGcd(int num1, int num2) {
        if (num1 == 0) {
            return Integer.toString(num2);
        }
        if (num2 == 0) {
            return Integer.toString(num1);
        }

        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }

        return Integer.toString(num1);
    }
}
