package array;

import java.util.Scanner;

public class ArrEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("입력할 정수의 개수를 입력하세요.");
        int n = sc.nextInt();

        int[] userInputs = new int[n];
        System.out.println(n + "개의 정수를 입력하세요.");
        for (int i = 0; i < n; i++) {
            userInputs[i] = sc.nextInt();
        }

        int minNum = userInputs[0];
        int maxNum = userInputs[0];
        for (int i = 0; i < n; i++) {
            if (userInputs[i] < minNum) {
                minNum = userInputs[i];
            } else if (userInputs[i] > maxNum) {
                maxNum = userInputs[i];
            }
        }
        System.out.println("가장 작은 수: " + minNum);
        System.out.println("가장 큰 수: " + maxNum);
    }
}
