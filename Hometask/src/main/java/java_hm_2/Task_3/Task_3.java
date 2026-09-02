package java_hm_2.Task_3;

public class Task_3 {
    public static void main(String[] args) {
        String test = "Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method.";
        test = test.toLowerCase();
        String[] parts = test.split("a");
        int a = parts.length - 1;
        System.out.println("Number of characters 'a' : " + a);
    }
}
