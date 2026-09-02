package java_hm_4.Task_4;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Петя","Маша","Олена","Федя","Саша","Антон","Гліб"};
        int[] time ={10,12,14,16,18,20};
        String[] place = {"школу","магазин","церква","тренажерний зал","кіно","поліклініки"};

        System.out.println("Введіть ім'я: ");
        int nameIndex = scanner.nextInt();

        System.out.println("Вкажіть час: ");
        int timeIndex = scanner.nextInt();

        System.out.println("Вкажіть місце: ");
        int placeIndex = scanner.nextInt();

        System.out.println(
                names[nameIndex -1] + " буде йти до " + place[placeIndex -1] + " o " + time[timeIndex] +":00"
        );
    }
}
