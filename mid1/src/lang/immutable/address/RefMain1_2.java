package lang.immutable.address;

public class RefMain1_2 {

    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = new Address("서울");
        System.out.println(a);
        System.out.println(b);

        b.setValue("부산");
        System.out.println(a);
        System.out.println(b);
    }
}
