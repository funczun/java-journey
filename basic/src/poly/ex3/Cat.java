package poly.ex3;

public class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("냥냥");
    }

    @Override
    public void move() {
        System.out.println("귀여운 고양이가 이동합니다.");
    }
}
