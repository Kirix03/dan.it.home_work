package java_hm_5;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String name = scanner.nextLine();

        NumbersApplication game = new NumbersApplication(name);

        game.startGame(scanner);

    }
}
