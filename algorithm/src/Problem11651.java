// https://www.acmicpc.net/problem/11651

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] coordinates = new int[N][2]; // [x, y] N개

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            coordinates[i][0] = Integer.parseInt(st.nextToken()); // x
            coordinates[i][1] = Integer.parseInt(st.nextToken()); // y
        }

        // 다단계 비교
        Arrays.sort(coordinates, (a, b) -> {
            if (a[1] != b[1]) {
                return a[1] - b[1]; // y 값 기준 오름차순 정렬
            } else {
                return a[0] - b[0]; // x 값 기준 오름차순 정렬
            }
        });

        // 출력
        for (int[] coord : coordinates) {
            System.out.println(coord[0] + " " + coord[1]);
        }
    }
}
