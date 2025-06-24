package etc;// https://www.acmicpc.net/problem/18110

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem18110 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] levels = new int[n];

        for (int i = 0; i < n; i++) {
            levels[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(levels); // 오름차순 정렬

        int sum = 0;
        int trunc = Math.round((float) n * 15 / 100); // 절삭 수치 (인덱스)

        // 절삭 후 누적 합계
        for (int i = trunc; i < n - trunc; i++) {
            sum += levels[i];
        }

        System.out.println(Math.round((float) sum / (n - (trunc * 2)))); // 평균 반올림
    }
}
