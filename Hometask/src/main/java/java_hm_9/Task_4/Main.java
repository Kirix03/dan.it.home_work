package java_hm_9.Task_4;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .setModel("Porshe 911")
                .setPrice(150000)
                .setmaxSpeed(250)
                .setCountOfWheels(4)
                .build();
        System.out.println(car);

    }
}
