package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class ProgressionGame {
    static final String RULES_GAME = "What number is missing in the progression?";
    static final int BEGIN_STEP = 1;
    static final int END_STEP = 3;
    static final int COUNT_MEMBER = 7;

    public static void start() {
        String[][] data = ProgressionGame.getData(Engine.COUNT_SET);
        Engine.startGame(RULES_GAME, data);
    }

    public static String[][] getData(int countSet) {
        String[][] result = new String[countSet][2];

        for (int i = 0; i < countSet; i++) {
            result[i] = getDataForRound();
        }

        return result;
    }

    public static String[] getDataForRound() {
        int start = Utils.getRandomTwoDigit();
        int step = Utils.getRandomNumInRange(BEGIN_STEP, END_STEP);
        int unknown = Utils.getRandomNumInRange(0, COUNT_MEMBER);
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
