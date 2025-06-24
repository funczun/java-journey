package etc;// https://www.acmicpc.net/problem/2420

import java.util.Scanner;

public class Problem2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        System.out.println(Math.abs(n - m));
    }
}
