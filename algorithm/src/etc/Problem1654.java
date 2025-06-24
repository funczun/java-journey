package etc;// https://www.acmicpc.net/problem/1654

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1654 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] items = new int[K];

        for (int i = 0; i < K; i++) {
            items[i] = Integer.parseInt(br.readLine());
        }

        binary(items, N);
    }

    static void binary(int[] list, int N) {
        Arrays.sort(list);

        long start = 1;
        long end = list[list.length - 1];

        while (start <= end) {
            long middle = (start + end) / 2;
            long count = 0;

            for (int item : list) {
                count += item / middle;
            }

            if (count >= N) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        System.out.println(end);
    }
}
