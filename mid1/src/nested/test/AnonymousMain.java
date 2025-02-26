package nested.test;

public class AnonymousMain {

    public static void main(String[] args) {
        Hello hello = new Hello() {
            static final String MESSAGE = "Hello World";

            @Override
            public void sayHello() {
                System.out.println(MESSAGE);
            }
        };

        hello.sayHello();
    }
}
