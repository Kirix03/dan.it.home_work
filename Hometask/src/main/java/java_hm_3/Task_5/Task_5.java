package java_hm_3.Task_5;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the operation (+, %, /, *): ");
        char operation = scanner.next().charAt(0);

        double result = operation == '+' ? a + b :
                operation == '%' ? a % b :
                        operation == '/' ? a / b :
                                operation == '*' ? a * b :
                                        0;

        System.out.println("Result: " + result);
    }
}
