// https://www.acmicpc.net/problem/7569

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};
    static int days = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int[][][] graph = new int[H][N][M];
        int[][][] visited = new int[H][N][M];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < M; k++) {
                    graph[i][j][k] = Integer.parseInt(st.nextToken());
                }
            }
        }

        bfs(graph, visited);
        printResult(graph);
    }

    static void bfs(int[][][] graph, int[][][] visited) {
        Queue<int[]> queue = new LinkedList<>();

        for (int z = 0; z < graph.length; z++) {
            for (int y = 0; y < graph[0].length; y++) {
                for (int x = 0; x < graph[0][0].length; x++) {
                    if (graph[z][y][x] == 1 && visited[z][y][x] == 0) {
                        queue.offer(new int[]{x, y, z});
                        visited[z][y][x] = 1;
                    }
                }
            }
        }

        int qSize = queue.size();

        while (!queue.isEmpty()) {
            for (int repeat = 0; repeat < qSize; repeat++) {
                int[] cur = queue.poll();

                if (cur != null) {
                    int x = cur[0];
                    int y = cur[1];
                    int z = cur[2];

                    for (int i = 0; i < 6; i++) {
                        int newX = x + dx[i];
                        int newY = y + dy[i];
                        int newZ = z + dz[i];

                        if (newX >= 0 && newX < graph[0][0].length &&
                                newY >= 0 && newY < graph[0].length && newZ >= 0 && newZ < graph.length &&
                                graph[newZ][newY][newX] == 0 && visited[newZ][newY][newX] == 0) {
                            graph[newZ][newY][newX] = 1;
                            queue.offer(new int[]{newX, newY, newZ});
                            visited[newZ][newY][newX] = 1;
                        }
                    }
                }
            }

            if (queue.isEmpty()) {
                return;
            }

            qSize = queue.size();
            days++;
        }
    }

    static void printResult(int[][][] graph) {
        for (int z = 0; z < graph.length; z++) {
            for (int y = 0; y < graph[0].length; y++) {
                for (int x = 0; x < graph[0][0].length; x++) {
                    if (graph[z][y][x] == 0) {
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }
        System.out.println(days);
    }
}
