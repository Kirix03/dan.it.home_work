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
            System.out.println("From these sides you can get a trikutnik");

        } else {

            System.out.println("From these sides it is impossible to wake up the trikutnik");
        }
    }
}
