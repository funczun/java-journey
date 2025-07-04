package etc;// https://www.acmicpc.net/problem/2161

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Problem2161 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Queue<Integer> q = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }

        while (!q.isEmpty()) {
            if (q.size() == 1) {
                sb.append(q.poll());
                break;
            }
            sb.append(q.poll()).append(" ");
            q.offer(q.poll());
        }

        System.out.println(sb);
    }
}
