package etc;// https://www.acmicpc.net/problem/1676

import java.io.*;

public class Problem1676 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int r = 0;
        int count = 0;

        // 5의 거듭제곱을 고려한 반복문
        while (N >= 5) {
            count += N / 5;
            N = N / 5;
        }

        System.out.println(count);
    }
}
