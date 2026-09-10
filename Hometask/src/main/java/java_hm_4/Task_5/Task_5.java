package java_hm_4.Task_5;
import java.util.Random;

public class Task_5 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[45];

        // Заповнюємо масив числами від -50 до 50
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101) - 50;
        }

        // Початкові мінімальне та максимальне значення
        int min = numbers[0];
        int max = numbers[0];

        // Шукаємо мінімум і максимум
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);

    }
}
