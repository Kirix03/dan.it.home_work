package java_hm_6_2.task_2;

public class Main {
    public static void main(String[] args) {
        String text = " Hi, I am Kyryll. ";
        TextProcessor upperCase = new UpperCaseProcessor();
        TextProcessor reverse = new ReverseProcessor();
        TextProcessor trim = new TrimProcessor();

        System.out.println("UpperCaseProcessor:");
        System.out.println(upperCase.process(text));

        System.out.println("ReverseProcessor:");
        System.out.println(reverse.process(text));

        System.out.println("TrimProcessor:");
        System.out.println(trim.process(text));

        System.out.println("Default method removeDigits");
        System.out.println(upperCase.removeDigits(text));
        System.out.println(reverse.removeDigits(text));
        System.out.println(trim.removeDigits(text));
    }
}
