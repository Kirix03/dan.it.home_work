package java_hm_4.Task_1;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = "";

        while (true){
            System.out.println("Enter word: ");
            String word = scanner.nextLine();

            if(word.equals("Stop")){
                break;
            }
            sentence += word + " ";
        }
        System.out.println("Sentence: "+ sentence);
    }
}
