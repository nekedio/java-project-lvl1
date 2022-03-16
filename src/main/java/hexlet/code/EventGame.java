package hexlet.code;

class EventGame {
    public static String getRulesGame() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static String[][] getData(int countSet) {
        final int multiplier = 100;

        String[][] result = new String[countSet][2];

        for (int i = 0; i < countSet; i++) {
            int num = (int) (Math.random() * multiplier);
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
