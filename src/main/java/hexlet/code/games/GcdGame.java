package hexlet.code.games;

import hexlet.code.Engine;

public class GcdGame {

    public static void start(int countSet) {
        String rulesGame = GcdGame.getRulesGame();
        String[][] data = GcdGame.getData(countSet);
        Engine.startGame(rulesGame, data);
    }

    static final String RULES_GAME = "Find the greatest common divisor of given numbers.";
    static final int MULTIPLIER = 10;

    public static String getRulesGame() {
        return RULES_GAME;
    }

    public static String[][] getData(int countSet) {
        String[][] result = new String[countSet][2];

        for (int i = 0; i < countSet; i++) {
            int num1 = (int) (Math.random() * MULTIPLIER);
            int num2 = (int) (Math.random() * MULTIPLIER);
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
