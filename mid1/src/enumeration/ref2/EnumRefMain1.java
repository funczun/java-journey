package enumeration.ref2;

public class EnumRefMain1 {

    public static void main(String[] args) {
        int price = 10_000_000;

        DiscountService discountService = new DiscountService();

        System.out.println("다이아몬드 등급 할인 금액: " + discountService.discount(Grade.DIAMOND, price));
    }
}
