// https://www.acmicpc.net/problem/1436

import java.util.Scanner;

public class Problem1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count666 = 0;

        // while 문으로 대체 가능
        for (int i = 666; true; i++) {
            String s = String.valueOf(i);

            // N번째 종말의 수 출력
            if (s.contains("666")) {
                count666++;
            }
            if (count666 == N) {
                System.out.println(i);
                break;
            }
        }
    }
}
