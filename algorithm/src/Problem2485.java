// https://www.acmicpc.net/problem/2485

import java.io.*;

public class Problem2485 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 나무 좌표 배열
        int[] points = new int[N];
        for (int i = 0; i < N; i++) {
            points[i] = Integer.parseInt(br.readLine());
        }

        // 나무 간격 배열
        int[] gaps = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            gaps[i] = points[i + 1] - points[i];
        }

        // 모든 간격의 최대공약수
        int gap = gaps[0];
        for (int i = 0; i < gaps.length - 1; i++) {
            gap = calGCD(gap, gaps[i + 1]);
        }

        // 추가할 나무 수
        int addTree = 0;
        for (int temp : gaps) {
            addTree += temp / gap - 1;
        }

        System.out.println(addTree);
    }

    // 최대공약수 메서드
    static int calGCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        } return a;
    }
}
