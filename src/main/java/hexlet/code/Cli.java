package hexlet.code;

import java.util.Scanner;

class Cli {

    public static String greet() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String nameUser = scanner.next();
        System.out.println("Hello, " + nameUser + "!");

        return nameUser;
    }
}

