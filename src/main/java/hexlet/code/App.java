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
        String rulesGame;
        String[][] data;

        cli.setChoice();

        switch (cli.getChoice()) {
            case (choiceGreet) -> {
                cli.sayWelcome();
                cli.setName();
                cli.sayHello();
            }
            case (choiceEven) -> {
                rulesGame = EventGame.getRulesGame();
                data = EventGame.getData(countSet);
                App.startGame(cli, rulesGame, data);
            }
            case (choiceCalc) -> {
                rulesGame = CalcGame.getRulesGame();
                data = CalcGame.getData(countSet);
                App.startGame(cli, rulesGame, data);
            }
            case (choiceGCD) -> {
                rulesGame = GcdGame.getRulesGame();
                data = GcdGame.getData(countSet);
                App.startGame(cli, rulesGame, data);
            }
            case (choiceProgression) -> {
                rulesGame = ProgressionGame.getRulesGame();
                data = ProgressionGame.getData(countSet);
                App.startGame(cli, rulesGame, data);
            }
            case (choicePrime) -> {
                rulesGame = PrimeGame.getRulesGame();
                data = PrimeGame.getData(countSet);
                App.startGame(cli, rulesGame, data);
            }
            default -> {
            }
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
