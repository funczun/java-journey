// https://www.acmicpc.net/problem/2231

import java.util.Scanner;

public class Problem2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 분해합 계산 (1 이상부터 N 미만까지)
        for (int num = 1; num < N; num++) {
            int temp = num;
            String strNum = Integer.toString(num);

            for (int i = 0; i < strNum.length(); i++) {
                temp += Integer.parseInt(String.valueOf(strNum.charAt(i)));
            }

            // 분해합이 N과 같으면 반복문 중지
            if (temp == N) {
                System.out.println(num);
                break;
            } else if (num == N - 1) {
                System.out.println(0);
            }
        }
    }
}
