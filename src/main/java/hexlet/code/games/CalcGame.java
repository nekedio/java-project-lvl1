package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class CalcGame {
    static final String RULES_GAME = "What is the result of the expression?";

    public static void start() {
        String[][] data = CalcGame.getData(Engine.COUNT_SET);
        Engine.startGame(RULES_GAME, data);
    }

    public static String[][] getData(int countSet) {
        String[][] result = new String[countSet][2];

        for (int i = 0; i < countSet; i++) {
            int num1 = Utils.getRandomSingleDigit();
            int num2 = Utils.getRandomSingleDigit();
            char[] signs = {'-', '*', '+'};
            char sign = getRandomSign(signs);
            result[i][0] = num1 + " " + sign + " " + num2;
            result[i][1] = getResult(sign, num1, num2);
        }

        return result;
    }

    private static String getResult(char sign, int num1, int num2) {
        return switch (sign) {
            case ('-') -> Integer.toString(num1 - num2);
            case ('+') -> Integer.toString(num1 + num2);
            case ('*') -> Integer.toString(num1 * num2);
            default -> throw new RuntimeException("Error! Sign \"" + sign + "\" is indefinite.");
        };
    }

    public static char getRandomSign(char[] signs) {
        int num = Utils.getRandomNumInRange(0, signs.length);

        return signs[num];
    }
}
