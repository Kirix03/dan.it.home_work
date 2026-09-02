package java_hm_3.Task_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > 0 && b > 0 && c > 0 &&
                a + b > c &&
                a + c > b &&
                b + c > a) {
            System.out.println("З цих сторін можна побудувати трикутник");

        } else {

            System.out.println("З цих сторін не можна побудувати трикутник");
        }
    }
}
