package poly.car0;

public class CarMain0 {

    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3 = new K3Car();
        driver.setK3Car(k3);
        driver.drive();

        // 차 변경
        Model3Car model3 = new Model3Car();
        driver.setK3Car(null); // 기존 차 제거
        driver.setModel3Car(model3);
        driver.drive();
    }
}
