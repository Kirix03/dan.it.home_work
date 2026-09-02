package java_hm_1;

public class Task_1 {
    public static void main(String[] args) {
        int a = 7;
        int b = 9;

        a=a*b/a;
        b=((a*a)%5)+a%6+a%6;

        System.out.println(a);
        System.out.println(b);
    }
}
