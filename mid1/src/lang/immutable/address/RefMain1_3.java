package lang.immutable.address;

public class RefMain1_3 {

    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        changeAddress(a, "부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void changeAddress(Address address, String newAddress) {
        System.out.println("주소 값 변경: " + address.getValue() + " -> " + newAddress);
        address.setValue(newAddress);
    }
}
