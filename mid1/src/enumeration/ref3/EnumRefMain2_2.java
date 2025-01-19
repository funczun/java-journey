package enumeration.ref3;

public class EnumRefMain2_2 {

    public static void main(String[] args) {
        int price = 10_000_000;

        printDiscount(Grade.BASIC, price);
        printDiscount(Grade.GOLD, price);
        printDiscount(Grade.DIAMOND, price);
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " 등급 할인 금액: " + grade.discount(price));
    }
}
