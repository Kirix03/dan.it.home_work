package java_hm_4.Task_2;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        String number = scanner.nextLine();
        String reversed = new StringBuilder(number).reverse().toString();

        if (number.equals(reversed)){
            System.out.println("The number is a palindrome.");
        }
        else {
            System.out.println("The number is not a polynomial.");
        }
    }
}
