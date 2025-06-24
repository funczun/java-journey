package etc;// https://www.acmicpc.net/problem/13241

import java.util.*;

public class Problem13241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long ab = Math.abs(a * b);

        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        long temp = a;
        System.out.println(ab / temp);
    }
}
