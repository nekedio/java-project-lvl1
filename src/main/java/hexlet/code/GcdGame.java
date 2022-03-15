package hexlet.code;

class GcdGame {
    public String getRulesGame() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String[][] getData(int countSet) {
        final int multiplier = 10;

        String[][] result = new String[countSet][2];

        for (int i = 0; i < countSet; i++) {
            int num1 = (int) (Math.random() * multiplier);
            int num2 = (int) (Math.random() * multiplier);
            result[i][0] = num1 + " " + num2;
            result[i][1] = getGcd(num1, num2);
        }

        return result;
    }

    public static String getGcd(int num1, int num2) {
        if (num1 == 0 && num2 == 0) {
            return "infinity";
        }
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
