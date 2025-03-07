package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Problem10026 {
    static final int[] dx = {0, 0, -1, 1};
    static final int[] dy = {1, -1, 0, 0};
    static Queue<int[]> queue = new LinkedList<>();
    static boolean isProcess = true;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        char[][] board = new char[N][N];
        int[][] visited = new int[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                board[i][j] = line.charAt(j);
            }
        }
        br.close();

        while (isProcess) {
            int[] point = point(visited);
            int x = point[0];
            int y = point[1];
            queue.add(new int[]{x, y});
            bfs(board, visited);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(count);

        isProcess = true;
        count = 0;
        visited = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 'R') {
                    board[i][j] = 'G';
                }
            }
        }

        while (isProcess) {
            int[] point = point(visited);
            int x = point[0];
            int y = point[1];
            queue.add(new int[]{x, y});
            bfs(board, visited);
        }

        sb.append(" ").append(count);

        System.out.print(sb);
    }

    static int[] point(int[][] visited) {
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[0].length; j++) {
                if (visited[i][j] == 0) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static void bfs(char[][] board, int[][] visited) {
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            if (x < 0 && y < 0) {
                isProcess = false;
                return;
            }
            visited[x][y] = 1;

            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                if (isValid(board, visited, newX, newY)) {
                    if (board[x][y] == board[newX][newY]) {
                        queue.add(new int[]{newX, newY});
                        visited[newX][newY] = 1;
                    }
                }
            }
        }
        count++;
    }

    static boolean isValid(char[][] board, int[][] visited, int x, int y) {
        return x >= 0 && x < board.length && y >= 0 && y < board[0].length && visited[x][y] == 0;
    }
}
