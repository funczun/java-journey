// https://www.acmicpc.net/problem/1929

import java.util.Scanner;

public class Problem1929 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start= sc.nextInt(); // 시작 숫자
        int end = sc.nextInt(); // 마지막 숫자
        int[] nums = new int[end + 1];

        for (int i = 2; i <= end; i++) {
            nums[i] = i;
        }

        // 에라토스테네스의 체
        for (int i = 2; i <= Math.sqrt(end); i++) {
            if (nums[i] == 0) {
                continue;
            }
            for (int j = i * i; j <= end; j += i) {
                nums[j] = 0;
            }
        }

        for (int i = start; i <= end; i++) {
            if (nums[i] != 0) {
                System.out.println(nums[i]);
            }
        }
    }
}
