package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int COUNT_SET = 3;

    public static void startGame(String rulesGame, String[][] data) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String nameUser = scanner.next();
        System.out.println("Hello, " + nameUser + "!");

        System.out.println(rulesGame);

        for (String[] set: data) {

            System.out.println("Question: " + set[0]);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            String correctAnswer = set[1];

            if (!answer.equals(correctAnswer)) {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", answer, correctAnswer);
                System.out.println("Let's try again, " + nameUser + "!");
                return;
            }
            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + nameUser + "!");
        scanner.close();
    }
}
