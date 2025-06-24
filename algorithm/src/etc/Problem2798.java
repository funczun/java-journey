package etc;// https://www.acmicpc.net/problem/2798

import java.util.Arrays;
import java.util.Scanner;

public class Problem2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] allNum = new int[N];

        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            // 입력된 숫자가 M보다 작은 케이스만 추가
            if (temp < M) {
                allNum[i] = temp;
            }
        }
        Arrays.sort(allNum);

        int[] threeNum = new int[3];

        int sum = 0; // 임시 합계
        int result = 0; // 최종 합계

        for (int i = N - 1; i >= 0; i--) {
            threeNum[0] = allNum[i];
            for (int j = i - 1; j >= 0; j--) {
                threeNum[1] = allNum[j];
                for (int k = j - 1; k >= 0; k--) {
                    threeNum[2] = allNum[k];
                    // 임시 합계 중 M보다 작거나 같으면서 가장 큰 케이스 산출
                    for (int forSum = 0; forSum < 3; forSum++) {
                        sum += threeNum[forSum];
                    }
                    if (sum <= M && sum > result) {
                        result = sum;
                    }
                    // 다음 루프를 위한 sum 변수 초기화
                    sum = 0;
                }
            }
        }
        System.out.println(result);
    }
}
