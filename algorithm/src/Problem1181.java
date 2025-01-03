// https://www.acmicpc.net/problem/1181

import java.io.*;
import java.util.*;

public class Problem1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> wordSet = new HashSet<>(); // 중복 제거

        for (int i = 0; i < N; i++) {
            wordSet.add(br.readLine());
        }

        List<String> words = new ArrayList<>(wordSet); // 리스트 생성

        // 조건부 정렬
        words.sort((a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            } else {
                return a.compareTo(b);
            }
        });

        for (String word : words) {
            System.out.println(word);
        }
    }
}
