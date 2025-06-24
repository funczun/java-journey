package etc;// https://www.acmicpc.net/problem/1735

import java.util.Scanner;

public class Problem1735 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int d1 = sc.nextInt();
        int n2 = sc.nextInt();
        int d2 = sc.nextInt();

        int newN = (n1 * d2) + (n2 * d1);
        int newD = d1 * d2;

        int GCD = calGCD(newN, newD);
        System.out.println(newN / GCD + " " + newD / GCD);
    }

    static int calGCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
