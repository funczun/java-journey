package poly.ex4;

public class SoundFlyMain {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        callSound(cat);
        callSound(bird);
        callSound(chicken);

        callFly(bird);
        callFly(chicken);
    }

    // AbstractAnimal 사용 가능
    static void callSound(AbstractAnimal abstractAnimal) {
        System.out.println("소리 테스트 시작");
        abstractAnimal.sound();
        System.out.println("소리 테스트 종료");
    }

    // Fly 인터페이스 있는 경우 사용 가능
    static void callFly(Fly fly) {
        System.out.println("날기 테스트 시작");
        fly.fly();
        System.out.println("날기 테스트 종료");
    }
}
