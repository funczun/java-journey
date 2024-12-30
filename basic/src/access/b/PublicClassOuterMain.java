package access.b;

import access.a.*;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // 다른 패키지 접근 불가
        // DefaultClass1 defaultClass1 = new DefaultClass1();
        // DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}
