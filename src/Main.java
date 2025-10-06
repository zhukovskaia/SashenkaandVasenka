import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Привет! Я простой бот. Напиши help для списка команд.");

        while (true) {
            String command = scanner.nextLine().trim();

            switch (command) {
                case "help":
                    System.out.println("Доступные команды:");
                    System.out.println("help - показать эту справку");
                    System.out.println("hello - поздороваться");
                    System.out.println("time - узнать текущее время");
                    System.out.println("exit - выйти");
                    break;
                case "hello":
                    System.out.println("Привет! Как твои дела?");
                    break;
                case "time":
                    System.out.println("Сейчас: " + java.time.LocalTime.now());
                    break;
                case "exit":
                    System.out.println("До свидания!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неизвестная команда. Напиши help для справки.");
                    break;
            }
        }
    }
}