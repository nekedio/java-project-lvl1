package hexlet.code;

import java.util.Scanner;

class Cli {
    public static String getGreet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        return name;
    }
}

