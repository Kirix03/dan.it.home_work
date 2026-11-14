package java_hm_9.Task_2;

public class Vechicle {
    private static Vechicle instance;

public static Vechicle getInstance(){
        if(instance ==  null){
            instance =  new Vechicle();
        }
        return instance;
    }
}
