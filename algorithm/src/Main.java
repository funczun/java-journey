import java.io.*;
import java.util.*;

public class Main {
    static int[][] matrix;
    static int white;
    static int blue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        cut(0, 0, N);

        System.out.println(white);
        System.out.println(blue);
    }

    static void cut(int row, int col, int dist) {
        if (isOneColor(row, col, dist)) {
            if (matrix[row][col] == 0) {
                white++;
            }
            else if (matrix[row][col] == 1) {
                blue++;
            }
            return;
        }

        int newDist = dist / 2;

        cut(row, col, newDist);
        cut(row, col + newDist, newDist);
        cut(row + newDist, col, newDist);
        cut(row + newDist, col + newDist, newDist);
    }

    static boolean isOneColor(int row , int col, int dist) {
        int color = matrix[row][col];

        for (int i = row; i < row + dist; i++) {
            for (int j = col; j < col + dist; j++) {
                if (matrix[i][j] != color) {
                    return false;
                }
            }
        }

        return true;
    }
}
