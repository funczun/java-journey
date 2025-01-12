package poly.diamond;

public class SayHi implements InterfaceA, InterfaceB {
    @Override
    public void hello() {
        System.out.println("Hi, How are you?");
    }
}
