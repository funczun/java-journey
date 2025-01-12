// https://www.acmicpc.net/problem/7568

import java.io.*;
import java.util.*;

public class Problem7568 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 사람 수
        int[][] userInfos = new int[n][2]; // 몸무게, 키
        StringTokenizer st;

        // 입력
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            st = new StringTokenizer(input);
            userInfos[i][0] = Integer.parseInt(st.nextToken()); // 몸무게
            userInfos[i][1] = Integer.parseInt(st.nextToken()); // 키
        }

        int[] userRanks = new int[n]; // 덩치 순위
        Arrays.fill(userRanks, 1); // 순위 초기화

        // 비교
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (userInfos[i][0] < userInfos[j][0] && userInfos[i][1] < userInfos[j][1]) {
                    userRanks[i]++; // 순위 조정
                }
            }
        }

        // 출력
        for (int i = 0; i < n; i++) {
            System.out.print(userRanks[i]);
            if (i != n - 1) {
                System.out.print(" ");
            }
        }
    }
}
