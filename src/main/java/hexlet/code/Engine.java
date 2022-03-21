package hexlet.code;

public class Engine {



    public static void startGame(String rulesGame, String[][] data) {
        Cli.sayWelcome();
        String name = Cli.getName();
        Cli.sayHello(name);
        Cli.sayRulesGame(rulesGame);

        for (String[] set: data) {
            String answer = Cli.startSetGame(set);
            String correctAnswer = set[1];
            if (!answer.equals(correctAnswer)) {
                Cli.sayIncorrect(answer, correctAnswer, name);
                return;
            }
            Cli.sayCorrect();
        }
        Cli.sayCongratulations(name);
    }
}
