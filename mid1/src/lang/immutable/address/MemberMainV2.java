package lang.immutable.address;

public class MemberMainV2 {

    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 m1 = new MemberV2("회원1", address);
        MemberV2 m2 = new MemberV2("회원2", address);

        System.out.println("m1 = " + m1);
        System.out.println("m2 = " + m2);

        m2.setAddress(new ImmutableAddress("부산"));
        System.out.println("m1 = " + m1);
        System.out.println("m2 = " + m2);
    }
}
