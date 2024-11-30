package array;

import java.util.Scanner;

public class ArrEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] userInputs = new int[5];
        System.out.println(userInputs.length + "개의 정수를 입력하세요.");
        for (int i = 0; i < userInputs.length; i++) {
            userInputs[i] = sc.nextInt();
        }

        int total = 0;
        for (int userInput : userInputs) {
            total += userInput;
        }
        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + (double) total / userInputs.length);
    }
}
