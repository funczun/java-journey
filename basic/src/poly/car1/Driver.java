package poly.car1;

public class Driver {

    private Car car;

    public void setCar(Car car) {
        System.out.println("차를 선택합니다.\n- 선택된 차: " + car);
        this.car = car;
    }

    public void drive() {
        System.out.println("차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
