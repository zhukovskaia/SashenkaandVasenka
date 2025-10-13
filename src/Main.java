import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Привет! Я простой бот. Напиши /help для списка команд.");

        while (true) {
            String command = scanner.nextLine().trim();
            boolean shouldExit = false;

            switch (command) {
                case "/help":
                    HelpCommand.execute();
                    break;
                case "/hello":
                    HelloCommand.execute();
                    break;
                case "/time":
                    TimeCommand.execute();
                    break;
                case "/info":
                    InfoCommand.execute();
                    break;
                case "/exit":
                    shouldExit = ExitCommand.execute();
                    break;
                default:
                    System.out.println("Неизвестная команда. Напиши /help для справки.");
                    break;
            }

            if (shouldExit) {
                scanner.close();
                break;
            }
        }
    }
}