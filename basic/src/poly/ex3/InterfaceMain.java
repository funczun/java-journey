package poly.ex3;

public class InterfaceMain {

    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Cow(), new Dog()};

        for (Animal animal : animals) {
            callSound(animal);
            callMove(animal);
        }
    }

    private static void callSound(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
    private static void callMove(Animal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
