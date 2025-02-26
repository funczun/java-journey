package nested.local;

import java.lang.reflect.Field;

public class LocalOuter {
    private int outInstanceVar = 3; // 멤버 변수

    public Printer process(int paramVar) {
        int localVar = 1; // 지역 변수

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        return new LocalPrinter();
    }

    public static void main(String[] args) {
        LocalOuter localOuter = new LocalOuter();
        Printer printer = localOuter.process(2);
        printer.print();

        System.out.println("check fields");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
