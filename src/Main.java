import java.util.Scanner;
import java.time.LocalTime;

class HelpCommand{
    public static void execute(){
        System.out.println("Доступные команды:");
        System.out.println("/help - показать эту справку");
        System.out.println("/hello - поздороваться");
        System.out.println("/time - узнать текущее время");
        System.out.println("/info - информация о боте");
        System.out.println("/exit - выйти");


    }
}

class HelloCommand{
    public static void execute(){
        System.out.println("Привет! Как твои дела?");

    }
}

class TimeCommand {
    public static void execute() {
        System.out.println("Сейчас: " + LocalTime.now());
    }
}

class InfoCommand {
    public static void execute() {
        System.out.println("Я простой консольный бот на Java");
        System.out.println("Создан для демонстрации команд");
    }
}

class ExitCommand {
    public static boolean execute() {
        System.out.println("До свидания!");
        return true; // сигнал для выхода
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Привет! Я простой бот. Напиши /help для списка команд.");

        while (true) {
            String command = scanner.nextLine().trim();
            boolean shouldExit=false;

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
