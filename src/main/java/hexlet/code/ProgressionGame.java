package hexlet.code;

class ProgressionGame {
    public static String getRulesGame() {
        return "What number is missing in the progression?";
    }

    public static String[][] getData(int countSet) {
        String[][] result = new String[countSet][2];

        for (int i = 0; i < countSet; i++) {
            result[i] = getRandomProgression();
        }

        return result;
    }

    public static String[] getRandomProgression() {
        final int multiplierStart = 100;
        final int multiplierStep = 3;
        final int countMember = 7;
        final int beginStep = 1;
        int start = (int) (Math.random() * multiplierStart);
        int step = beginStep + (int) (Math.random() * multiplierStep);
        int unknown = (int) (Math.random() * countMember);
        int unknownValue = 0;
        String[] result = new String[2];
        StringBuilder progression = new StringBuilder();

        int member = start;
        for (int i = 0; i < countMember; i++) {
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
