package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EventGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;

public class App {
    static final int CHOICE_EXIT = 0;
    static final int CHOICE_GREET = 1;
    static final int CHOICE_EVEN = 2;
    static final int CHOICE_CALC = 3;
    static final int CHOICE_GCD = 4;
    static final int CHOICE_PROGRESSION = 5;
    static final int CHOICE_PRIME = 6;

    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """);
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextInt()) {
            case (CHOICE_GREET) -> Cli.greet();
            case (CHOICE_EVEN) -> EventGame.start();
            case (CHOICE_CALC) -> CalcGame.start();
            case (CHOICE_GCD) -> GcdGame.start();
            case (CHOICE_PROGRESSION) -> ProgressionGame.start();
            case (CHOICE_PRIME) -> PrimeGame.start();
            case (CHOICE_EXIT) -> System.exit(0);
            default -> throw new RuntimeException("Error! There is no such choice.");
        }
    }
}
