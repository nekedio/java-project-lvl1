package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class EventGame {

    static final String RULES_GAME = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void start() {
        String[][] data = EventGame.getData(Engine.COUNT_SET);
        Engine.startGame(RULES_GAME, data);
    }

    public static String[][] getData(int countSet) {

        String[][] result = new String[countSet][2];

        for (int i = 0; i < countSet; i++) {
            int num = Utils.getRandomTwoDigit();
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
