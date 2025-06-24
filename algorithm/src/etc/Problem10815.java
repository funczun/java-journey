package etc;// https://www.acmicpc.net/problem/10815

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Problem10815 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> cards = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            cards.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int inputCard = Integer.parseInt(st.nextToken());

            if (cards.contains(inputCard)) {
                sb.append(1);
            } else {
                sb.append(0);
            }

            if (i < M - 1) {
                sb.append(" ");
            }
        }

        System.out.println(sb);
    }
}
