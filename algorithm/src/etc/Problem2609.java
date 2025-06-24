package etc;// https://www.acmicpc.net/problem/2609

import java.io.*;
import java.util.StringTokenizer;

public class Problem2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int min = Math.min(num1, num2); // 더 작은 정수

        for (int i = min; i > 0; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                int GCD = i; // 최대 공약수
                int LCM = Math.abs(num1 * num2) / GCD; // 최소 공배수
                System.out.println(GCD);
                System.out.println(LCM);
                break;
            }
        }
    }
}
