package hexlet.code.games;

import hexlet.code.Engine;

public class ProgressionGame {
    static final String RULES_GAME = "What number is missing in the progression?";
    static final int MULTIPLIER_START = 100;
    static final int MULTIPLIER_STEP = 3;
    static final int COUNT_MEMBER = 7;
    static final int BEGIN_STEP = 1;

    public static void start(int countSet) {
        String rulesGame = ProgressionGame.getRulesGame();
        String[][] data = ProgressionGame.getData(countSet);
        Engine.startGame(rulesGame, data);
    }

    public static String getRulesGame() {
        return RULES_GAME;
    }

    public static String[][] getData(int countSet) {
        String[][] result = new String[countSet][2];

        for (int i = 0; i < countSet; i++) {
            result[i] = getRandomProgression();
        }

        return result;
    }

    public static String[] getRandomProgression() {
        int start = (int) (Math.random() * MULTIPLIER_START);
        int step = BEGIN_STEP + (int) (Math.random() * MULTIPLIER_STEP);
        int unknown = (int) (Math.random() * COUNT_MEMBER);
        int unknownValue = 0;
        String[] result = new String[2];
        StringBuilder progression = new StringBuilder();

        int member = start;
        for (int i = 0; i < COUNT_MEMBER; i++) {
            if (i == unknown) {
                progression.append("..");
                unknownValue = member;
            } else {
                progression.append(member);
            }
            progression.append(" ");
            member = member + step;
        }

        result[0] = progression.toString().trim();
        result[1] = Integer.toString(unknownValue);
        return result;
    }


}
