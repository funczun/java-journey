// https://www.acmicpc.net/problem/1427

import java.io.*;
import java.util.*;

public class Problem1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int[] nums = new int[N.length()];

        for (int i = 0; i < N.length(); i++) {
            nums[i] = N.charAt(i);
        }

        Arrays.sort(nums); // 오름차순

        // 내림차순
        for (int i = N.length() - 1; i >= 0; i--) {
            System.out.print(nums[i] - 48);
        }
    }
}
