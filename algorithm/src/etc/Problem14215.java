package etc;// https://www.acmicpc.net/problem/14215

import java.util.Scanner;

public class Problem14215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] length = new int[3];
        int sum = 0;
        int max = 0;

        for (int i = 0; i < 3; i++) {
            length[i] = sc.nextInt();
            sum += length[i];

            if (length[i] > max) {
                max = length[i];
            }
        }

        if (max < (sum - max)) {
            System.out.println(sum);
        } else {
            System.out.println((sum - max) * 2 - 1);
        }
    }
}
