import java.util.Scanner;
import java.time.LocalTime;

class HelpCommand {
    public static void execute() {
        System.out.println("Доступные команды:");
        System.out.println("/help - показать эту справку");
        System.out.println("/hello - поздороваться");
        System.out.println("/time - узнать текущее время");
        System.out.println("/info - информация о боте");
        System.out.println("/exit - выйти");
    }
}