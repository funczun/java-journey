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

        int count1 = bfs(board, visited);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 'R') {
                    board[i][j] = 'G';
                }
            }
        }

        visited = new int[N][N];
        int count2 = bfs(board, visited);

        System.out.print(count1 + " " + count2);
    }

    static int bfs(char[][] board, int[][] visited) {
        queue.clear();
        int count = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (visited[i][j] == 0) {
                    visited[i][j] = 1;
                    queue.add(new int[]{i, j});
                    while (!queue.isEmpty()) {
                        int[] cur = queue.poll();
                        int x = cur[0];
                        int y = cur[1];

                        for (int d = 0; d < 4; d++) {
                            int newX = x + dx[d];
                            int newY = y + dy[d];
                            if (isValid(board, visited, newX, newY) && board[x][y] == board[newX][newY]) {
                                queue.add(new int[]{newX, newY});
                                visited[newX][newY] = 1;
                            }
                        }
                    }
                    count++;
                }
            }
        }
        return count;
    }

    static boolean isValid(char[][] board, int[][] visited, int x, int y) {
        return x >= 0 && x < board.length && y >= 0 && y < board[0].length && visited[x][y] == 0;
    }
}
