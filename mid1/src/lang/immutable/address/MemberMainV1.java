package lang.immutable.address;

public class MemberMainV1 {

    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 m1 = new MemberV1("회원1", address);
        MemberV1 m2 = new MemberV1("회원2", address);

        System.out.println("m1 = " + m1);
        System.out.println("m2 = " + m2);

        /*
        Address address1 = m2.getAddress();
        address1.setValue("부산");
         */
        m2.getAddress().setValue("부산");

        System.out.println("m1 = " + m1); // 사이드 이펙트 발생
        System.out.println("m2 = " + m2);
    }
}
