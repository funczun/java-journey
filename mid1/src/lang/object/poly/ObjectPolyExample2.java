package lang.object.poly;

public class ObjectPolyExample2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object obj = new Object();

        Object[] objects = {dog, car, obj};
        size(objects);
    }

    private static void size(Object[] arr) {
        System.out.println("전달된 객체의 수는: " + arr.length);
    }
}
