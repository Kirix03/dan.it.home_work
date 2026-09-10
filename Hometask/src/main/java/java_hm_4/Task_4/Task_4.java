package java_hm_4.Task_4;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Petya","Masha","Olena","Fedya","Sasha","Anton","Gleb"};
        int[] time ={10,12,14,16,18,20};
        String[] place = {"School","Store","Church","Gym","Cinema","Hospital"};

        System.out.println("Enter name: ");
        int nameIndex = scanner.nextInt();

        System.out.println("Enter time: ");
        int timeIndex = scanner.nextInt();

        System.out.println("Enter place: ");
        int placeIndex = scanner.nextInt();

        System.out.println(
                names[nameIndex -1] + " will go to " + place[placeIndex -1] + " in " + time[timeIndex] +":00"
        );
    }
}
