package java_hm_3.Task_6;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть назву програми (IntelliJ IDEA, Git, Java): ");
        String program = scanner.nextLine();

        System.out.print("Введіть ОС (Linux, MacOS, Windows): ");
        String os = scanner.nextLine();

        String link = " ";

        switch (program) {
            case "IntelliJ IDEA":
                switch (os) {
                    case "Linux":
                        link = "https://www.jetbrains.com/idea/download/?section=linux";
                        System.out.println(link);
                        break;
                    case "MacOS":
                        link = "https://www.jetbrains.com/idea/download/?section=mac";
                        System.out.println(link);
                        break;
                    case "Windows":
                        link = "https://www.jetbrains.com/idea/download/?section=windows";
                        System.out.println(link);
                        break;
                    default:
                        System.out.println("Такої ОС не існує");
                }
                break;

            case "Git":
                switch (os) {
                    case "Linux":
                        link = "https://git-scm.com/download/linux";
                        System.out.println(link);
                        break;
                    case "MacOS":
                        link = "https://git-scm.com/download/mac";
                        System.out.println(link);
                        break;
                    case "Windows":
                        link = "https://git-scm.com/download/win";
                        System.out.println(link);
                        break;
                    default:
                        System.out.println("Такої ОС не існує");
                }
                break;

            case "Java":
                switch (os) {
                    case "Linux":
                        link = "https://www.oracle.com/java/technologies/downloads/";
                        System.out.println(link);
                        break;
                    case "MacOS":
                        link = "https://www.oracle.com/java/technologies/downloads/";
                        System.out.println(link);
                        break;
                    case "Windows":
                        link = "https://www.oracle.com/java/technologies/downloads/";
                        System.out.println(link);
                        break;
                    default:
                        System.out.println("Такої ОС не існує");
                }
                break;

            default:
                System.out.println("Такої програми не існує");

                if (!link.isEmpty()) {
                    System.out.println("Посилання для завантаження:");
                    System.out.println(link);


                }
        }
    }
}
