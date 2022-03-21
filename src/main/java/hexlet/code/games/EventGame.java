package hexlet.code.games;

import hexlet.code.Engine;

public class EventGame {

    static final String RULES_GAME = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    static final int MULTIPLIER = 100;

    public static void start(int countSet) {
        String rulesGame = EventGame.getRulesGame();
        String[][] data = EventGame.getData(countSet);
        Engine.startGame(rulesGame, data);
    }

    public static String getRulesGame() {
        return RULES_GAME;
    }

    public static String[][] getData(int countSet) {

        String[][] result = new String[countSet][2];

        for (int i = 0; i < countSet; i++) {
            int num = (int) (Math.random() * MULTIPLIER);
            result[i][0] = Integer.toString(num);
            result[i][1] = isEven(num);
        }

        return result;
    }

    private static String isEven(int num) {
        if (num % 2 == 0) {
            return "yes";
        }

        return "no";
    }
}
