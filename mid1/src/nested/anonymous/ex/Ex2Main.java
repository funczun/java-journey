package nested.anonymous.ex;

import java.util.Random;

public class Ex2Main {
    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        System.out.println("실행");

        hello(() -> System.out.println(new Random().nextInt(6) + 1));

        hello(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        });
    }
}
