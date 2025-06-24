package etc;// https://www.acmicpc.net/problem/17219

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Problem17219 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> userMap = new HashMap<>();

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            userMap.put(st.nextToken(), st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        while (M-- > 0) {
            sb.append(userMap.get(br.readLine())).append('\n');
        }

        System.out.print(sb);
    }
}
