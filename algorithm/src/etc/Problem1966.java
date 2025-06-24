package etc;// https://www.acmicpc.net/problem/1966

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Problem1966 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 문서의 개수
            int M = Integer.parseInt(st.nextToken()); // 문서의 위치

            Queue<int[]> q = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                q.add(new int[]{j, Integer.parseInt(st.nextToken())});
            }

            int order = 0; // 순서

            while (!q.isEmpty()) {
                int[] firstDoc = q.poll();
                boolean isHighest = true;

                // 중요도 비교
                for (int[] doc : q) {
                    if (firstDoc[1] < doc[1]) {
                        q.add(firstDoc);
                        isHighest = false;
                        break;
                    }
                }

                if (isHighest) {
                    order++;
                    // 비교 검증에 통과한 문서가 찾는 문서라면 결과 출력
                    if (firstDoc[0] == M) {
                        System.out.println(order);
                        break;
                    }
                }
            }
        }
    }
}
