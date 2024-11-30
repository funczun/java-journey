package condition;

public class Condition {
    public static void main(String[] args) {
        // if
        int grade1 = 2;

        int coupon1;
        if (grade1 == 1) {
            coupon1 = 1000;
        } else if (grade1 == 2) {
            coupon1 = 2000;
        } else if (grade1 == 3) {
            coupon1 = 3000;
        } else {
            coupon1 = 500;
        }
        System.out.println("발급 받은 쿠폰 " + coupon1);

        // switch
        int grade2 = 2;

        int coupon2;
        switch (grade2) {
            case 1:
                coupon2 = 1000;
                break;
            case 2:
                coupon2 = 2000;
                break;
            case 3:
                coupon2 = 3000;
                break;
            default:
                coupon2 = 500;
        }
        System.out.println("발급 받은 쿠폰 " + coupon2);

        // switch (java 14)
        int grade3 = 2;

        int coupon3 = switch (grade3) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급 받을 쿠폰 " + coupon3);

        // 삼항 연산자 사용 전
        int age1 = 18;
        String status1;
        if (age1 >= 18) {
            status1 = "성인";
        } else {
            status1 = "미성년자";
        }
        System.out.println("age = " + age1 + ", status = " + status1);

        // 삼항 연산자 사용 후
        int age2 = 18;
        String status2 = (age2 >= 18) ? "성인" : "미성년자";
        System.out.println("age = " + age2 + ", status = " + status2);
    }
}
