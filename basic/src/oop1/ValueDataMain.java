package oop1;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData vd = new ValueData();
        add(vd);
        add(vd);
        add(vd);
        System.out.println("Final is " + vd.value);
    }

    static void add(ValueData vd) {
        vd.value++;
        System.out.println("Up to " + vd.value);
    }
}
