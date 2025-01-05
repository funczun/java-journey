package extends1.ex1;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar eCar = new ElectricCar();
        eCar.move();
        eCar.charge();

        GasCar gCar = new GasCar();
        gCar.move();
        gCar.fillUp();
    }
}
