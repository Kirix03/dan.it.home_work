package java_hm_4.Task_3;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter max weith: ");

        double capacity = scanner.nextDouble();
        double Freespace = capacity;
        while (Freespace > 0){
            System.out.println("Free space in the warehouse: " + Freespace + " kg");
            System.out.println("Вага для здачі металу: ");
            double metal = scanner.nextDouble();

            if (metal < 5) {
                System.out.println("It is impossible to accept metal weighing less than 5 kg.");
            }
            else if (metal > Freespace) {
                System.out.println("Not enough space on the shelf");
            }
            else{
                Freespace -= metal;
                System.out.println("Metal accepted");
                System.out.println("Remaining space in the warehouse: " + Freespace + "kg");
            }
        }
        scanner.close();
    }
}
