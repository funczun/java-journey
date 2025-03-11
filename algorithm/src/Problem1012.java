import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Problem1012 {
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int[][] graph = new int[N][M];
            int[][] visited = new int[N][M];

            int K = Integer.parseInt(st.nextToken());
            while (K-- > 0) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[y][x] = 1;
            }

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (visited[j][i] == 0 && graph[j][i] == 1) {
                        q.offer(new int[]{i, j});
                        visited[j][i] = 1;
                        bfs(graph, visited);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    static void bfs(int[][] graph, int[][] visited) {
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                if (newX >= 0 && newX < graph[0].length && newY >= 0 && newY < graph.length &&
                        graph[newY][newX] == 1 && visited[newY][newX] == 0) {
                    q.offer(new int[]{newX, newY});
                    visited[newY][newX] = 1;
                }
            }
        }
    }
}
