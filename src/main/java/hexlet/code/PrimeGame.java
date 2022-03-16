package hexlet.code;

class PrimeGame {
    public static String getRulesGame() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String[][] getData(int countSet) {
        final int multiplier = 100;

        String[][] result = new String[countSet][2];

        for (int i = 0; i < countSet; i++) {
            int num = 2 + (int) (Math.random() * multiplier);
            result[i][0] = Integer.toString(num);
            result[i][1] = isPrime(num);
        }

        return result;
    }

    private static String isPrime(int num) {
        int i = num - 1;
        while (i > 1) {
            if (num % i == 0) {
                return "no";
            }
            i--;
        }
        return "yes";
    }
}
