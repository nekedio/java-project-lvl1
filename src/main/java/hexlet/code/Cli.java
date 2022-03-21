package hexlet.code;

import java.util.Scanner;

class Cli {

    public static int getChoice(String listGames) {
        System.out.println(listGames);
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        return scanner.nextInt();
    }

    public static String getName() {
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

    public static void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void sayRulesGame(String rules) {
        System.out.println(rules);
    }

    public static void sayCongratulations(String name) {
        System.out.println("Congratulations, " + name + "!");
    }

    public static void sayCorrect() {
        System.out.println("Correct!");
    }

    public static void sayIncorrect(String answer, String correctAnswer, String name) {
        System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", answer, correctAnswer);
        System.out.println("Let's try again, " + name + "!");
    }

    public static void sayWelcome() {
        System.out.println("Welcome to the Brain Games!");
    }

    public static String startSetGame(String[] set) {
        System.out.println("Question: " + set[0]);
        System.out.print("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

