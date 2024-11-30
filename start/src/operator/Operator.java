package operator;

public class Operator {
    public static void main(String[] args) {
        // 몫 반환
        System.out.println("몫 반환");
        int num1 = 5, num2 = 2;
        System.out.println(num1 / num2);

        // 변수 추가 선언
        int newNum = 0;

        // 전위 증감 연산자
        System.out.println("전위 증감 연산자");
        num1 = 0;
        newNum = ++num1;
        System.out.println("newNum = " + newNum + ", num1 = " + num1);

        // 후위 증감 연산자
        System.out.println("후위 증감 연산자");
        num1 = 0;
        newNum = num1++;
        System.out.println("newNum = " + newNum + ", num1 = " + num1);

        // 비교 연산자
        System.out.println("비교 연산자");
        int a = 1;
        float b = 0.1f;
        double c = 0.1;
        System.out.println(a + b == 1.1);
        System.out.println(a + c == 1.1);

        // 문자열 비교 연산자
        System.out.println("문자열 비교 연산자");
        String str1 = "hello";
        String str2 = "Hello";
        boolean bool = str1.equals(str2);
        System.out.println(bool);

        // 논리 연산자
        System.out.println("논리 연산자");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);
        System.out.println(!true);
        System.out.println(!false);

        // 축약 대입 연산자
        System.out.println("축약 대입 연산자");
        int num = 5;
        num += 1;
        System.out.println(num);
    }
}
