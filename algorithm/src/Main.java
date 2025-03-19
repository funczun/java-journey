import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int start;
    static int end;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] trees = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            if (trees[i] > end) {
                end = trees[i];
            }
        }

        binary(trees, M);
    }

    static void binary(int[] trees, int M) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long sum = 0;

            for (int tree : trees) {
                int afterCut = tree - mid;
                if (afterCut > 0) {
                    sum += afterCut;
                }
            }

            if (sum > M) {
                start = mid + 1;
            } else if (sum < M) {
                end = mid - 1;
            } else {
                System.out.print(mid);
                return;
            }
        }

        System.out.println(end);
    }
}
