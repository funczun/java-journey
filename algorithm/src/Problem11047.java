// https://www.acmicpc.net/problem/11047

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem11047 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] values = new int[n];

        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;

        while (k > 0) {
            for (int i = values.length - 1; i >= 0; i--) {
                count += k / values[i];
                k -= k / values[i] * values[i];
            }
        }

        System.out.println(count);
    }
}
