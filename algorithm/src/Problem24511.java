// https://www.acmicpc.net/problem/1439

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem24511 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int count = 0;
        char lastValue;

        for (int i = 0; i < s.length() - 1; i++) {
            lastValue = s.charAt(i);

            if (lastValue != s.charAt(i + 1)) {
                count++;
            }
        }

        System.out.println(count / 2 + count % 2);
    }
}
