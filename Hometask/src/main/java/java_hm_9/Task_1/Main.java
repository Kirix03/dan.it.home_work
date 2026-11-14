package java_hm_9.Task_1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Honda",260);
        Car car2 = new Car("Toyta",160);
        Car car3 = new Car("Lexus",190);
        Car car4 = new Car("Acura",200);
        Car car5 = new Car("Ford",185);

        CarComporator carComporatod = new CarComporator();

        List<Car> carList = new ArrayList<>();

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        System.out.println(carList);

        carList.sort(carComporatod);

        System.out.println(carList);


    }
}
