// https://www.acmicpc.net/problem/14425

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Problem14425 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 집합에 포함될 문자열 수
        int m = Integer.parseInt(st.nextToken()); // 검사할 문자열 수

        HashSet<String> words = new HashSet<>();

        while (n-- > 0) {
            words.add(br.readLine());
        }

        int count = 0;

        while (m-- > 0) {
            if (words.contains(br.readLine())) {
                count++;
            }
        }

        System.out.println(count);
    }
}
