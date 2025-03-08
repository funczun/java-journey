package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Problem1260 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int[][] graph = new int[N + 1][N + 1];
        int[] visited = new int[N + 1];
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        br.close();

        dfs(V, N, graph, visited);
        visited = new int[N + 1];
        bfs(V, N, graph, visited);

        System.out.print(sb.toString().trim());
    }

    static void dfs(int V, int N, int[][] graph, int[] visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(V);
        visited[V] = 1;
        sb.append(V).append(" ");

        while (!stack.isEmpty()) {
            int num = stack.peek();
            boolean found = false;

            for (int i = 1; i <= N; i++) {
                if (graph[num][i] == 1 && visited[i] == 0) {
                    stack.push(i);
                    visited[i] = 1;
                    sb.append(i).append(" ");
                    found = true;
                    break;
                }
            }

            if (!found) {
                stack.pop();
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("\n");
    }

    static void bfs(int V, int N, int[][] graph, int[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(V);

        while (!queue.isEmpty()) {
            int num = queue.poll();
            visited[num] = 1;
            sb.append(num).append(" ");

            for (int i = 0; i <= N; i++) {
                if (graph[num][i] == 1 && visited[i] == 0) {
                    queue.offer(i);
                    visited[i] = 1;
                }
            }
        }
    }
}
