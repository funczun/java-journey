// https://www.acmicpc.net/problem/4153

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] nums = new int[3];

        while (true) {
            st = new StringTokenizer(br.readLine());
            nums[0] = Integer.parseInt(st.nextToken());
            nums[1] = Integer.parseInt(st.nextToken());
            nums[2] = Integer.parseInt(st.nextToken());

            // 오름차순 정렬
            Arrays.sort(nums);

            // 최대 숫자 0일 시 중단
            if (nums[2] == 0) {
                break;
            }

            // 직각삼각형 점검
            if (Math.pow(nums[2], 2) == (Math.pow(nums[0], 2) + Math.pow(nums[1], 2))) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
