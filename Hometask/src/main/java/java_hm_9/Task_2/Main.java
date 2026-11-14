package java_hm_9.Task_2;

public class Main {
    public static void main(String[] args) {
        Vechicle vechicle1 = Vechicle.getInstance();
        Vechicle vechicle2 = Vechicle.getInstance();
        Vechicle vechicle3 = Vechicle.getInstance();
        Vechicle vechicle4 = Vechicle.getInstance();
        Vechicle vechicle5 = Vechicle.getInstance();

        System.out.println(vechicle1.hashCode());
        System.out.println(vechicle2.hashCode());
        System.out.println(vechicle3.hashCode());
        System.out.println(vechicle4.hashCode());
        System.out.println(vechicle5.hashCode());

    }
}
