package etc;// https://www.acmicpc.net/problem/15964

import java.util.Scanner;

public class Problem15964 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        System.out.println((n + m) * (n - m));
    }
}
