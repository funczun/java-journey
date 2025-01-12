package poly.ex3;

public class Cow implements Animal {
    @Override
    public void sound() {
        System.out.println("무무");
    }

    @Override
    public void move() {
        System.out.println("커다란 소가 이동합니다.");
    }
}
