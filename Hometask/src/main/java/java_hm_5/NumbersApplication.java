package java_hm_5;
import java.util.Scanner;
import java.util.Random;

public class NumbersApplication {
    String name;
    int gameNumber;

    public NumbersApplication(String name){
        this.name = name;
        Random random = new Random();
        this.gameNumber = random.nextInt(101);
    }
    public void startGame(Scanner scanner){
        System.out.println("Let the game begin");
        while (true){
            System.out.println("Enter you number: ");
            int userNumber = scanner.nextInt();
            if (userNumber < gameNumber){
                System.out.println("Your number is too small. Please, try again!");
            } else if (userNumber > gameNumber){
                System.out.println("Your number is too big. Please, try again!");
            } else {
                System.out.println("Congratulations, " + name + "!");
                break;
            }

        }
    }
}
