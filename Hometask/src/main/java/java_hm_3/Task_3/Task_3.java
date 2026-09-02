package java_hm_3.Task_3;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int difference = a > b ? a - b : b - a;

        System.out.println("Різниця = " + difference);
    }
}
