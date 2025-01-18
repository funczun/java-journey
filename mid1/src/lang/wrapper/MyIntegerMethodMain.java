package lang.wrapper;

public class MyIntegerMethodMain {

    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(100);

        int i1 = myInteger.compareTo(50);
        int i2 = myInteger.compareTo(100);
        int i3 = myInteger.compareTo(200);

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }
}
