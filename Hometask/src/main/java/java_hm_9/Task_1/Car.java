package java_hm_9.Task_1;

public class Car implements Comparable<Car>{

    private String name;

    private int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }


    @Override
    public int compareTo(Car o) {
        return this.speed - o.speed;
    }
}
