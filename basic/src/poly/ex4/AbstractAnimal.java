package poly.ex4;

public abstract class AbstractAnimal {

    public abstract void sound();

    public void move() {
        System.out.println("[상속 메서드] 이동합니다.");
    }
}
