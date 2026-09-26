package java_hm_6_1.task_2;

public class Truck extends Vehicle{
    double loadCapacity;

    public Truck(String name, int speed, double loadCapacity){
        super(name, speed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void move(){
        System.out.println("Transport " + name + " by load-carrying capacity " + loadCapacity + " tonnes is moving at a speed of " + speed + " km/h" );
    }

}



