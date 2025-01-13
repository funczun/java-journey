package poly.car1;

public class CarMain1 {

    public static void main(String[] args) {
        Driver driver = new Driver();

        // 차량 선택
        driver.setCar(new K3Car());
        driver.drive();

        // 차량 변경 (K3 -> Model3)
        driver.setCar(new Model3Car());
        driver.drive();

        // 차량 변경 (Model3 -> NewCar)
        driver.setCar(new NewCar());
        driver.drive();
    }
}
