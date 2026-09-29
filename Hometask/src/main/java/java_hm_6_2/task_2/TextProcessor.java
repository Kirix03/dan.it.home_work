package java_hm_6_2.task_2;

public interface TextProcessor {
    String process(String text);
    default String removeDigits(String text){
        return text.replace(".","");
    }
}
