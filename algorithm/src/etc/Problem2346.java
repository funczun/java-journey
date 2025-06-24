package etc;// https://www.acmicpc.net/problem/2346

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Problem2346 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Deque<int[]> balloons = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            balloons.offerLast(new int[] {i + 1, Integer.parseInt(st.nextToken())});
        }

        StringBuilder sb = new StringBuilder();

        int count;

        while (!balloons.isEmpty()) {
            int[] balloon = balloons.pollFirst();
            int balloonIndex = balloon[0];
            int balloonValue = balloon[1];

            sb.append(balloonIndex);
            if (!balloons.isEmpty()) {
                sb.append(" ");
            }

            if (balloons.isEmpty()) {
                break;
            }

            if (balloonValue > 0) {
                count = balloonValue - 1;

                for (int i = 0; i < count; i++) {
                    balloons.offerLast(balloons.pollFirst());
                }
            } else if (balloonValue < 0) {
                count = Math.abs(balloonValue);

                for (int i = 0; i < count; i++) {
                    balloons.offerFirst(balloons.pollLast());
                }
            }
        }

        System.out.println(sb);
    }
}
