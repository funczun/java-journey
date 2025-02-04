// https://www.acmicpc.net/problem/1764

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem1764 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> noSound = new HashSet<>();

        while (N-- > 0) {
            noSound.add(br.readLine());
        }

        int count = 0;

        HashSet<String> temp = new HashSet<>();

        while (M-- > 0) {
            String name = br.readLine();

            if (noSound.contains(name)) {
                count++;
                temp.add(name);
            }
        }

        StringBuilder sb = new StringBuilder();
        ArrayList<String> result = new ArrayList<>(temp);
        Collections.sort(result);

        sb.append(count).append("\n");

        for (String name : result) {
            sb.append(name).append("\n");
        }

        System.out.print(sb);
    }
}
