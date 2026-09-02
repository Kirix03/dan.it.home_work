package java_hm_2.Task_2;

import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        String string = "Testing, is my favourite job";
        String[] words = string.split(" ");
        System.out.println(Arrays.toString(words));
        for (int i = 0; i < words.length; i++)
        {
            System.out.println("Word " + (i + 1) + " = " + words[i] + ", lend of this word = " + words[i].length());
        }
        boolean Longest = true;
        int a = words[0].length();
        for (int i = 1; i < words.length; i++){
            if (words[i].length() >= a){
                Longest = false;
                break;
            }
        }
        System.out.println(Longest);
    }
}
