package java_hm_6_1.task_2;

public class main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 120, 5 );

        Truck truck = new Truck("MAN", 90,20.5);

        car.move();
        car.stop();

        System.out.println();

        truck.move();
        truck.stop();

    }
}
