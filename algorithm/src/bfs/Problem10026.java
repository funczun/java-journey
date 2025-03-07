package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Problem10026 {
    static final int[] dx = {0, 0, -1, 1};
    static final int[] dy = {1, -1, 0, 0};

    static Queue<int[]> queue1 = new LinkedList<>();
    static Queue<int[]> queue2 = new LinkedList<>();
    static boolean isProcess1 = true;
    static boolean isProcess2 = true;
    static int count1 = 0;
    static int count2 = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] board1 = new char[N][N];
        char[][] board2 = new char[N][N];
        int[][] visited1 = new int[N][N];
        int[][] visited2 = new int[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                char ch = line.charAt(j);
                board1[i][j] = ch;
                if (ch == 'R') {
                    board2[i][j] = 'G';
                } else {
                    board2[i][j] = ch;
                }
            }
        }

        while (isProcess1) {
            int[] point = point(visited1);
            int x = point[0];
            int y = point[1];
            queue1.add(new int[]{x, y});
            bfs1(board1, visited1);
        }

        while (isProcess2) {
            int[] point = point(visited2);
            int x = point[0];
            int y = point[1];
            queue2.add(new int[]{x, y});
            bfs2(board2, visited2);
        }

        System.out.println(count1 + " " + count2);
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

    static void bfs1(char[][] board1, int[][] visited1) {
        while (!queue1.isEmpty()) {
            int[] cur = queue1.poll();
            int x = cur[0];
            int y = cur[1];
            if (x < 0 && y < 0) {
                isProcess1 = false;
                return;
            }
            visited1[x][y] = 1;

            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                if (isValid(board1, visited1, newX, newY)) {
                    if (board1[x][y] == board1[newX][newY]) {
                        queue1.add(new int[]{newX, newY});
                        visited1[newX][newY] = 1;
                    }
                }
            }
        }
        count1++;
    }

    static void bfs2(char[][] board2, int[][] visited2) {
        while (!queue2.isEmpty()) {
            int[] cur = queue2.poll();
            int x = cur[0];
            int y = cur[1];
            if (x < 0 && y < 0) {
                isProcess2 = false;
                return;
            }
            visited2[x][y] = 1;

            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                if (isValid(board2, visited2, newX, newY)) {
                    if (board2[x][y] == board2[newX][newY]) {
                        queue2.add(new int[]{newX, newY});
                        visited2[newX][newY] = 1;
                    }
                }
            }
        }
        count2++;
    }

    static boolean isValid(char[][] board, int[][] visited, int x, int y) {
        return x >= 0 && x < board.length && y >= 0 && y < board[0].length && visited[x][y] == 0;
    }
}
