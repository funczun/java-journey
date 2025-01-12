package poly.diamond;

public class SayHiMain {

    public static void main(String[] args) {
        SayHi sayHi = new SayHi();
        sayHi.hello();

        InterfaceA interfaceA = new SayHi();
        interfaceA.hello();

        InterfaceB interfaceB = new SayHi();
        interfaceB.hello();
    }
}
