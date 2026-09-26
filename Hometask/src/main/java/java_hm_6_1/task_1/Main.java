package java_hm_6_1.task_1;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Dog dog = new Dog();
        Fish fish = new Fish();

        bird.eat();
        bird.sleep();
        bird.fly();

        dog.eat();
        dog.sleep();
        dog.bark();

        fish.eat();
        fish.sleep();
        fish.swim();

    }
}
