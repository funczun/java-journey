package enumeration.ref1;

public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {
        return classGrade.getDiscountPercent() * price / 100;
    }
}
