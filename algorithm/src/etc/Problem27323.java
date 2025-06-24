package etc;// https://www.acmicpc.net/problem/27323

import java.util.Scanner;

public class Problem27323 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(mul(a, b));
    }

    public static int mul(int a, int b) {
        return a * b;
    }
}
