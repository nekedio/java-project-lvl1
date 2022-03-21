package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EventGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

public class App {

    static final int COUNT_SET = 3;
    static final int CHOICE_GREET = 1;
    static final int CHOICE_EVEN = 2;
    static final int CHOICE_CALC = 3;
    static final int CHOICE_GCD = 4;
    static final int CHOICE_PROGRESSION = 5;
    static final int CHOICE_PRIME = 6;

    public static void main(String[] args) {
        switch (Cli.getChoice(getListGames())) {
            case (CHOICE_GREET) -> {
                Cli.sayWelcome();
                String name = Cli.getName();
                Cli.sayHello(name);
            }
            case (CHOICE_EVEN) -> EventGame.start(COUNT_SET);
            case (CHOICE_CALC) -> CalcGame.start(COUNT_SET);
            case (CHOICE_GCD) -> GcdGame.start(COUNT_SET);
            case (CHOICE_PROGRESSION) -> ProgressionGame.start(COUNT_SET);
            case (CHOICE_PRIME) -> PrimeGame.start(COUNT_SET);
            default -> {
            }
        }
    }

    private static String getListGames() {

        return """
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """;
    }
}
