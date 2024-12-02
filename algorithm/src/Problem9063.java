// https://www.acmicpc.net/problem/9063

import java.util.Scanner;

public class Problem9063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int minX = 0;
        int maxX = 0;
        int minY = 0;
        int maxY = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (i == 0) {
                minX = x;
                maxX = x;
                minY = y;
                maxY = y;
            }

            if (x < minX) {
                minX = x;
            } else if (x > maxX) {
                maxX = x;
            }

            if (y < minY) {
                minY = y;
            } else if (y > maxY) {
                maxY = y;
            }
        }
        System.out.println((maxX - minX) * (maxY - minY));
    }
}
