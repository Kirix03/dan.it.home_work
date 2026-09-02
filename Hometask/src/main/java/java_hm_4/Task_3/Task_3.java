package java_hm_4.Task_3;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть максимальну вагу: ");

        double capacity = scanner.nextDouble();
        double Freespace = capacity;
        while (Freespace > 0){
            System.out.println("Вільне місце на складi: " + Freespace + " кг");
            System.out.println("Вага для здачі металу: ");
            double metal = scanner.nextDouble();

            if (metal < 5) {
                System.out.println("Неможливо прийняти метал вагою менше 5 кг");
            }
            else if (metal > Freespace) {
                System.out.println("Недостатньо місця на скалді");
            }
            else{
                Freespace -= metal;
                System.out.println("Метал прийнято");
                System.out.println("Залишок місця на складі: " + Freespace + "кг");
            }
        }
        scanner.close();
    }
}
