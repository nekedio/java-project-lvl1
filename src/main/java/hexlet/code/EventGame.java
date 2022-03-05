package hexlet.code;

import java.util.Scanner;

class EventGame {
    public static void startGame() {
        String name = Cli.getGreet();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);

        final int countSet = 3;
        final int multiplier = 10;
        for (int i = 0; i < countSet; i++) {
            int randomNum = (int) (Math.random() * multiplier);
            System.out.println("Question: " + randomNum);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (!(answer.equals("yes") || answer.equals("no"))) {
                return;
            }
            boolean boolAnswer = EventGame.getBoolAnswer(answer);

            if (boolAnswer != isEven(randomNum)) {
                return;
            }

            System.out.println("Correct!");
            System.out.println("Congratulations, " + name + "!");

        }
    }

    private static boolean getBoolAnswer(String line) {
        if (line.equals("yes")) {
            return true;
        }

        return false;
    }

    private static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }

        return false;
    }
}
