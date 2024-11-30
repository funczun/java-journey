// https://www.acmicpc.net/problem/1085

import java.util.Scanner;

public class Problem1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int minDistance = Math.min(Math.min(x, w - x), Math.min(y, h - y));
        System.out.println(minDistance);
    }
}
