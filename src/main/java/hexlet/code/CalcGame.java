package hexlet.code;

class CalcGame {
    public static String getRulesGame() {
        return "What is the result of the expression?";
    }

    public static String[][] getData(int countSet) {
        final int multiplier = 10;

        String[][] result = new String[countSet][2];

        for (int i = 0; i < countSet; i++) {
            int num1 = (int) (Math.random() * multiplier);
            int num2 = (int) (Math.random() * multiplier);
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
        final int multiplier = 3;
        int num1 = (int) (Math.random() * multiplier);
        return switch (num1) {
            case (1) -> '-';
            case (2) -> '+';
            default -> '*';
        };
    }
}
