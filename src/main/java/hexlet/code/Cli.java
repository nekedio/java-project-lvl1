package hexlet.code;

import java.util.Scanner;

class Cli {
  public static String getName() {
    System.out.println("May I have your name?");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();

    return name;
  }
}
