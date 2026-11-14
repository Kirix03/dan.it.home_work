package java_hm_9.Task_3;

import java.util.Locale;

public class AnimalFactory {
    public Animal creatAnimal(String type){
        switch (type.toLowerCase()){
            case "dog":
            return new Dog();

            case "cat":
                return new Cat();

            case "bird":
                return new Bird();

            default:
                System.out.println("There is no such kind of animal" + type);
                return null;

        }
    }
}
