package java_hm_6_1.task_2;

import java.sql.SQLOutput;

public class Car extends Vehicle{
    int passengerCapacity;

    public Car(String name, int speed, int passengerCapacity) {
        super(name, speed);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void move(){
        System.out.println("Transport " + name + " moves at a speed of " + speed + " km/h " + passengerCapacity + " number of people");
    }


}
