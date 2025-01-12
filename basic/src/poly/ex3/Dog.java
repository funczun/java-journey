package poly.ex3;

public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("멋진 개가 이동합니다.");
    }
}
