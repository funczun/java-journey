// https://www.acmicpc.net/problem/2775

import java.io.*;

public class Problem2775 {
    public static void main(String[] args) throws IOException {
        int[][] rooms = new int[15][15]; // 편의상 호수도 15까지

        for (int i = 0; i < 15; i++) {
            rooms[0][i] = i + 1; // 0층 전체 호수
            rooms[i][0] = 1; // 각 층 1호
        }

        // 1층 - 14층 전체 호수
        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                rooms[i][j] = rooms[i][j - 1] + rooms[i - 1][j];
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // k층 n호 인원수
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(rooms[k][n - 1]);
        }
    }
}
