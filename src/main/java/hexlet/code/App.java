package hexlet.code;

public class App {
    public static void main(String[] args) {
        final int countSet = 3;
        final int choiceGreet = 1;
        final int choiceEven = 2;
        final int choiceCalc = 3;

        Cli cli = new Cli();

        cli.setChoice();

        if (cli.getChoice() == choiceGreet) {
            cli.sayWelcome();
            cli.setName();
            cli.sayHello();
        }

        if (cli.getChoice() == choiceEven) {
            cli.sayWelcome();
            cli.setName();
            cli.sayHello();
            EventGame eventGame = new EventGame();
            cli.sayRulesGame(eventGame.getRulesGame());
            String[][] data = EventGame.getData(countSet);

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

        if (cli.getChoice() == choiceCalc) {
            cli.sayWelcome();
            cli.setName();
            cli.sayHello();
            CalcGame calcGame = new CalcGame();
            cli.sayRulesGame(calcGame.getRulesGame());
            String[][] data = CalcGame.getData(countSet);

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
}
