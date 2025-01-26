// https://www.acmicpc.net/problem/10816

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem10816 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 보유한 카드 수
        Map<Integer, Integer> cardMap = new HashMap<>(); // (number, count)

        StringTokenizer st = new StringTokenizer(br.readLine()); // numbers

        // cardMap
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(st.nextToken());
            cardMap.put(number, cardMap.getOrDefault(number, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine()); // 확인하고 싶은 카드 수

        st = new StringTokenizer(br.readLine()); // numbers
        StringBuilder sb = new StringBuilder();

        // check cards
        for (int i = 0; i < M; i++) {
            int number = Integer.parseInt(st.nextToken());
            sb.append(cardMap.getOrDefault(number, 0));
            if (i < M - 1) {
                sb.append(" ");
            }
        }

        System.out.println(sb);
    }
}
