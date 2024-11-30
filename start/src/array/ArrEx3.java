package array;

import java.util.Scanner;

public class ArrEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] userInputs;
        userInputs = new int[5];
        System.out.println(userInputs.length + "개의 정수를 입력하세요.");

        for (int i = 0; i < userInputs.length; i++) {
            userInputs[i] = sc.nextInt();
        }

        System.out.println("입력된 정수를 역순으로 출력합니다.");
        for (int i = userInputs.length - 1; i >= 0; i--) {
            System.out.print(userInputs[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
    }
}
