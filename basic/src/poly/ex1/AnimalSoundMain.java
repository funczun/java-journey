package poly.ex1;

public class AnimalSoundMain {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Cow cow = new Cow();
        Dog dog = new Dog();

        System.out.println("= 동물 소리 테스트 시작 =");
        cat.sound();
        System.out.println("= 동물 소리 테스트 종료 =");

        soundCow(cow);

        System.out.println("= 동물 소리 테스트 시작 =");
        dog.sound();
        System.out.println("= 동물 소리 테스트 종료 =");
    }

    private static void soundCow(Cow cow) {
        System.out.println("= 동물 소리 테스트 시작 =");
        cow.sound();
        System.out.println("= 동물 소리 테스트 시작 =");
    }
}
