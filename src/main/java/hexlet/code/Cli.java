package hexlet.code;

import java.util.Scanner;

class Cli {

    private int choice;
    private String name;

    public void setChoice() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);

        choice = scanner.nextInt();
        System.out.println();
    }

    public int getChoice() {
        return choice;
    }

    public void setName() {
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);

        name = scanner.nextLine();
    }

    public void sayHello() {
        System.out.println("Hello, " + name + "!");
    }

    public void sayRulesGame(String rules) {
        System.out.println(rules);
    }

    public  void sayCongratulations() {
        System.out.println("Congratulations, " + name + "!");
    }

    public  void sayCorrect() {
        System.out.println("Correct!");
    }

    public  void sayIncorrect(String answer, String correctAnswer) {
        System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", answer, correctAnswer);
        System.out.println("Let's try again, " + name);
    }

    public void sayWelcome() {
        System.out.println("Welcome to the Brain Games!");
    }

    public String startSetGame(String[] set) {
        System.out.println("Question: " + set[0]);
        System.out.print("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

