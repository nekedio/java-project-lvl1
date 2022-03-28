package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int COUNT_SET = 3;

    public static void startGame(String rulesGame, String[][] data) {

        String nameUser = Cli.greet();

        System.out.println(rulesGame);

        for (String[] set: data) {

            System.out.println("Question: " + set[0]);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();

            String correctAnswer = set[1];

            if (!answer.equals(correctAnswer)) {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", answer, correctAnswer);
                System.out.println("Let's try again, " + nameUser + "!");
                return;
            }
            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + nameUser + "!");
    }
}
