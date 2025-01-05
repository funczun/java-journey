package extends1.overriding;

public class ElectricCar extends Car {

    @Override
    public void move() {
        System.out.println("Car move fast");
    }

    public void charge() {
        System.out.println("Car charge");
    }
}
