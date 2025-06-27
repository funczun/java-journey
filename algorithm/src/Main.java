import java.io.*;
import java.util.*;

public class Main {
    static int[][] graph;
    static int[] visited;
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        graph = new int[N + 1][N + 1];
        visited = new int[N + 1];

        for (int i = 1; i < M + 1; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            graph[start][end] = 1;
            graph[end][start] = 1;
        }

        count(graph, 1);
        System.out.print(result);
    }

    static void count(int[][] graph, int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);

        while (!q.isEmpty()) {
            int cur = q.poll();

            if (visited[cur] == 1) {
                continue;
            }

            visited[cur] = 1;

            for (int i = 1; i < graph[cur].length; i++) {
                if (graph[cur][i] == 1) {
                    q.offer(i);
                }
            }
        }

        result++;

        for (int i = 1; i < visited.length; i++) {
            if (visited[i] == 0) {
                count(graph, i);
            }
        }
    }
}
