package array;

import java.util.Scanner;

public class ArrEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] userInputs = new int[5];
        System.out.println(userInputs.length + "개의 정수를 입력하세요.");

        for (int i = 0; i < userInputs.length; i++) {
            userInputs[i] = sc.nextInt();
        }

        System.out.println("입력된 정수를 출력합니다.");
        for (int i = 0; i < userInputs.length; i++) {
            System.out.print(userInputs[i]);
            if (i != userInputs.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
