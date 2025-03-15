// https://www.acmicpc.net/problem/21736

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static char[][] campus;
    static boolean[][] visited;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        campus = new char[N][M];
        visited = new boolean[N][M];

        int[] cur = new int[2];

        for (int row = 0; row < N; row++) {
            String line = br.readLine();
            for (int col = 0; col < M; col++) {
                campus[row][col] = line.charAt(col);
                if (line.charAt(col) == 'I') {
                    cur = new int[]{row, col};
                }
            }
        }

        bfs(campus, visited, cur);

        if (count == 0) {
            System.out.println("TT");
        } else if (count > 0) {
            System.out.println(count);
        }
    }

    static void bfs(char[][] grid, boolean[][] visited, int[] cur) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(cur);
        visited[cur[0]][cur[1]] = true;

        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            int row = pos[0];
            int col = pos[1];

            for (int i = 0; i < 4; i++) {
                int newRow = row + dx[i];
                int newCol = col + dy[i];

                if (newRow >= 0 && newRow < N &&
                        newCol >= 0 && newCol < M && !visited[newRow][newCol]) {
                    visited[newRow][newCol] = true;

                    if (grid[newRow][newCol] == 'X') {
                        continue;
                    }
                    if (grid[newRow][newCol] == 'P') {
                        count++;
                    }
                    queue.offer(new int[]{newRow, newCol});
                }
            }
        }
    }
}
