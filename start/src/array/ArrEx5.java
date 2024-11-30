package array;

import java.util.Scanner;

public class ArrEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("입력할 정수의 개수를 입력하세요.");
        int n = sc.nextInt();

        int[] userInputs = new int[n];
        System.out.println(n + "개의 정수를 입력하세요.");
        for (int i = 0; i < n; i++) {
            userInputs[i] = sc.nextInt();
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            total += userInputs[i];
        }
        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + (double) total / n);
    }
}
