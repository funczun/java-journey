package enumeration.ref1;

public class ClassGradeRefMain {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        System.out.println(discountService.discount(ClassGrade.BASIC, price));
    }
}
