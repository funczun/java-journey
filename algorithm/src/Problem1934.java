// https://www.acmicpc.net/problem/1934

import java.io.*;
import java.util.StringTokenizer;

public class Problem1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(calculateLCM(a, b));
        }
    }

    static int calculateLCM(int a, int b) {
        return Math.abs(a * b) / calculateGCD(a, b); // 최소 공배수 공식
    }

    // 유클리드 호제법
    static int calculateGCD(int a, int b) {
        while (b != 0) {
            int r = a % b; // 나머지

            // GCD(a, b) = GCD(b, r)
            a = b;
            b = r;
        }
        return a;
    }
}
