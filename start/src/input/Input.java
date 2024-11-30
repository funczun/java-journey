package input;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("정수 입력 (0 입력 시 종료): ");
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            sum += n;
        }
        System.out.println("누적 합계: " + sum);
    }
}
