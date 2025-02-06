// https://www.acmicpc.net/problem/11478

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Problem11478 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        HashSet<String> words = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                words.add(s.substring(i, j)); // zero-based index
            }
        }

        System.out.println(words.size());
    }
}
