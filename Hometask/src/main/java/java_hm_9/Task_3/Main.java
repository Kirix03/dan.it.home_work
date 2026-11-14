package java_hm_9.Task_3;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal dog = animalFactory.creatAnimal("dog");
        Animal cat = animalFactory.creatAnimal("cat");
        Animal bird = animalFactory.creatAnimal("bird");

        dog.speak();
        cat.speak();
        bird.speak();
    }
}