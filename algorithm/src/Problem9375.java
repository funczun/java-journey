// http://acmicpc.net/problem/9375

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Problem9375 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            HashMap<String, Integer> itemMap = new HashMap<>();
            int n = Integer.parseInt(br.readLine());

            while (n-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                st.nextToken();
                String item = st.nextToken();
                itemMap.put(item, itemMap.getOrDefault(item, 1) + 1);
            }

            int[] values = itemMap.values().stream().mapToInt(i -> i).toArray();
            int result = 1;

            for (int value : values) {
                result *= value;
            }

            System.out.println(--result);
        }
    }
}
