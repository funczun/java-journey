package condition;

public class CondEx6 {
    public static void main(String[] args) {
        int a = 10, b = 20;

        if (a == b) {
            System.out.println("두 숫자가 같습니다.");
        } else {
            int max = (a > b) ? a : b;
            System.out.println("더 큰 숫자는 " + max + "입니다.");
        }
    }
}
