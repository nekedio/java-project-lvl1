package hexlet.code.games;

import hexlet.code.Engine;

public class CalcGame {
    static final String RULES_GAME = "What is the result of the expression?";
    static final int MULTIPLIER_SIGN = 3;
    static final int MULTIPLIER = 10;

    public static void start(int countSet) {
        String rulesGame = CalcGame.getRulesGame();
        String[][] data = CalcGame.getData(countSet);
        Engine.startGame(rulesGame, data);
    }

    public static String getRulesGame() {
        return RULES_GAME;
    }

    public static String[][] getData(int countSet) {
        String[][] result = new String[countSet][2];

        for (int i = 0; i < countSet; i++) {
            int num1 = (int) (Math.random() * MULTIPLIER);
            int num2 = (int) (Math.random() * MULTIPLIER);
            char sign = getRandomSign();
            result[i][0] = num1 + " " + sign + " " + num2;
            result[i][1] = getResult(sign, num1, num2);
        }

        return result;
    }

    private static String getResult(char sign, int num1, int num2) {
        return switch (sign) {
            case ('-') -> Integer.toString(num1 - num2);
            case ('+') -> Integer.toString(num1 + num2);
            default -> Integer.toString(num1 * num2);
        };
    }

    private static char getRandomSign() {
        int num1 = (int) (Math.random() * MULTIPLIER_SIGN);
        return switch (num1) {
            case (1) -> '-';
            case (2) -> '+';
            default -> '*';
        };
    }
}
