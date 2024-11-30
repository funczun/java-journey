package input;

import java.util.Scanner;

public class InputEx9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요. (-1 입력 시 중단)");
        int sum = 0;
        int count = 0;
        int input;

        while ((input = sc.nextInt()) != -1) {
            count++;
            sum += input;
            }
        System.out.println("합계: " + sum + ", 평균: " + (double) sum / count);
    }
}
