package etc;// https://www.acmicpc.net/problem/2839

import java.util.Scanner;

public class Problem2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int temp = 0;

        outer:
        for (int i = 0; i <= N / 3; i++) {
            for (int j = 0; j <= N / 5; j++) {
                temp = (3 * i) + (5 * j);

                if (temp == N) {
                    System.out.println(i + j);
                    break outer;
                }
            }
        }

        if (temp != N) {
            System.out.println(-1);
        }
    }
}
