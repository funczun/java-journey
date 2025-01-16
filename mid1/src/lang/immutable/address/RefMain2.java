package lang.immutable.address;

public class RefMain2 {

    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;
        System.out.println(a);
        System.out.println(b);

        System.out.println(a);
        System.out.println(b);
    }
}
