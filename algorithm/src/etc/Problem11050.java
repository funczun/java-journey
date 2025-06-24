package etc;// https://www.acmicpc.net/problem/11050

import java.io.*;
import java.util.StringTokenizer;

public class Problem11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 이항 계수
        System.out.println(factorial(N) / (factorial(N - K) * factorial(K)));
    }

    // 팩토리얼 메서드
    static int factorial(int n) {
        int result = 1;
        for (int i = n; i > 1; i--) {
            result *= i;
        }
        return result;
    }
}
