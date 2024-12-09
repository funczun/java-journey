// https://www.acmicpc.net/problem/24265

import java.util.Scanner;

public class Problem24265 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();

        System.out.println(n * (n - 1) / 2);
        System.out.println(2);
    }
}
