// https://www.acmicpc.net/problem/18870

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem18870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] origin = new int[N];
        int[] ascending = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            origin[i] = ascending[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(ascending);

        HashMap<Integer, Integer> ranking = new HashMap<>();
        int rank = 0;

        for (int num : ascending) {
            if (!ranking.containsKey(num)) {
                ranking.put(num, rank++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int key : origin) {
            int value = ranking.get(key);
            sb.append(value).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
