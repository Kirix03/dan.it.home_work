package java_hm_3.Task_5;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть друге число: ");
        double b = scanner.nextDouble();

        System.out.print("Введіть операцію (+, %, /, *): ");
        char operation = scanner.next().charAt(0);

        double result = operation == '+' ? a + b :
                operation == '%' ? a % b :
                        operation == '/' ? a / b :
                                operation == '*' ? a * b :
                                        0;

        System.out.println("Результат: " + result);
    }
}
