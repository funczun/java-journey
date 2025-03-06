package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Problem7576 {
    static Queue<int[]> q = new LinkedList<>(); // 익은 사과 좌표 큐
    static int[][] grid; // 사과 창고
    static int[] dx = {0, 0, -1, 1}; // 좌우
    static int[] dy = {1, -1, 0, 0}; // 상하

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken()); // 열 크기
        int N = Integer.parseInt(st.nextToken()); // 행 크기
        grid = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < M; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());

                if (grid[i][j] == 1) {
                    q.offer(new int[]{i, j});
                }
            }
        }
        br.close();

        System.out.println(bfs(grid));
    }

    public static int bfs(int[][] grid) {
        int level = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) { // 레벨 단위로 처리
                int[] cur = q.poll(); // 가장 앞에 있는 익은 사과 좌표 추출
                int x = cur[0];
                int y = cur[1];

                for (int j = 0; j < 4; j++) { // cur 기준 상하좌우 탐색
                    int newX = x + dx[j];
                    int newY = y + dy[j];

                    if (isValid(newX, newY, grid)) { // 새 좌표가 사과 창고 범위를 벗어나지 않으면 추가
                        grid[newX][newY] = 1;
                        q.offer(new int[]{newX, newY});
                    }
                }
            }

            if (!q.isEmpty()) {
                level++;
            }
        }

        if (containsZero(grid)) {
            return -1;
        }
        return level;
    }

    private static boolean isValid(int newX, int newY, int[][] grid) {
        // 인덱스를 먼저 점검하여 ArrayIndexOutOfBoundsException 예방
        return newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length && grid[newX][newY] == 0;
    }

    private static boolean containsZero(int[][] grid) {
        for (int[] row : grid) {
            for (int i = 0; i < grid[0].length; i++) {
                if (row[i] == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
