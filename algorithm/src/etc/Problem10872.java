package etc;// https://www.acmicpc.net/problem/10872

import java.util.Scanner;

public class Problem10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
