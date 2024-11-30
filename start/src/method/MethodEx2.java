package method;

public class MethodEx2 {
    public static void main(String[] args) {
        loopPrint("Hello, funczun!", 5);
    }

    public static void loopPrint(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
