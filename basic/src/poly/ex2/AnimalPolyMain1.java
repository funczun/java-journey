package poly.ex2;

public class AnimalPolyMain1 {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Cow cow = new Cow();
        Dog dog = new Dog();
        Duck duck = new Duck();

        callSound(cat);
        callSound(cow);
        callSound(dog);
        callSound(duck);
    }

    static void callSound(Animal animal) {
        System.out.println("---- 사운드 호출 ----");
        animal.sound();
        System.out.println("-- 사운드 호출 완료 --");
    }
}
