package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {

        // 환경 속성
        System.out.println(System.getenv());

        // 시스템 속성
        System.out.println("java.library.path: " + System.getProperty("java.library.path"));

        // 배열 고속 복사
        char[] original = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        char[] copied = new char[original.length];
        System.arraycopy(original, 0, copied, 0, original.length);

        System.out.println(original == copied);
        System.out.println(Arrays.toString(copied));

        // 프로그램 종료
        System.exit(0);
    }
}
