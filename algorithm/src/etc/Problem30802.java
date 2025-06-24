package etc;// https://www.acmicpc.net/problem/30802

import java.io.*;
import java.util.StringTokenizer;

public class Problem30802 {
    public static void main(String[] args) throws IOException {
        // 사이즈 6종에 대한 배열
        int[] nums = new int[6];

        // 참가자 수 N
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 배열에 사이즈별 티셔츠 수 대입
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        // 묶음당 티셔츠 수 T, 묶음당 펜 수 P
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        // 티셔츠 최소 묶음 수 계산
        int bundle = 0;
        for (int i = 0; i < 6; i++) {
            if (nums[i] % T == 0) {
                bundle += nums[i] / T;
            } else {
                bundle += nums[i] / T + 1;
            }
        }
        System.out.println(bundle);
        System.out.println(N / P + " " + N % P);
    }
}
