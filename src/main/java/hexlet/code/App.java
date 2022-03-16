package hexlet.code;

public class App {
    public static void main(String[] args) {
        final int countSet = 3;
        final int choiceGreet = 1;
        final int choiceEven = 2;
        final int choiceCalc = 3;
        final int choiceGCD = 4;
        final int choiceProgression = 5;
        final int choicePrime = 6;

        Cli cli = new Cli();

        cli.setChoice();

        if (cli.getChoice() == choiceGreet) {
            cli.sayWelcome();
            cli.setName();
            cli.sayHello();
        }

        if (cli.getChoice() == choiceEven) {
            String rulesGame = EventGame.getRulesGame();
            String[][] data = EventGame.getData(countSet);

            App.startGame(cli, rulesGame, data);
        }

        if (cli.getChoice() == choiceCalc) {
            String rulesGame = CalcGame.getRulesGame();
            String[][] data = CalcGame.getData(countSet);

            App.startGame(cli, rulesGame, data);
        }

        if (cli.getChoice() == choiceGCD) {
            String rulesGame = GcdGame.getRulesGame();
            String[][] data = GcdGame.getData(countSet);

            App.startGame(cli, rulesGame, data);
        }

        if (cli.getChoice() == choiceProgression) {
            String rulesGame = ProgressionGame.getRulesGame();
            String[][] data = ProgressionGame.getData(countSet);

            App.startGame(cli, rulesGame, data);
        }

        if (cli.getChoice() == choicePrime) {
            String rulesGame = PrimeGame.getRulesGame();
            String[][] data = PrimeGame.getData(countSet);

            App.startGame(cli, rulesGame, data);
        }
    }

    private static void startGame(Cli cli, String rulesGame, String[][] data) {
        cli.sayWelcome();
        cli.setName();
        cli.sayHello();
        cli.sayRulesGame(rulesGame);

        for (String[] set: data) {
            String answer = cli.startSetGame(set);
            String correctAnswer = set[1];
            if (!answer.equals(correctAnswer)) {
                cli.sayIncorrect(answer, correctAnswer);
                return;
            }
            cli.sayCorrect();
        }
        cli.sayCongratulations();
    }
}
