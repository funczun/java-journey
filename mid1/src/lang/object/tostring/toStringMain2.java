package lang.object.tostring;

public class toStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("KIA");
        Dog dog1 = new Dog("Kim", 2);
        Dog dog2 = new Dog("Lee", 5);

        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);
    }
}
