package enumeration.ex2;

import enumeration.ex1.StringGrade;

public class DiscountService {

    public int discount(ClassGrade grade, int price) {
        int discountPercent = 0;

        if (grade == ClassGrade.BASIC) {
            discountPercent = 10;
        } else if (grade == ClassGrade.GOLD) {
            discountPercent = 20;
        } else if (grade == ClassGrade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println(grade + ": 할인X");
        }
        return price * discountPercent / 100;
    }
}
