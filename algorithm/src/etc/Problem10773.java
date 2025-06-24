package etc;// https://www.acmicpc.net/problem/10773

import java.io.*;
import java.util.ArrayList;

public class Problem10773 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        ArrayList<Integer> numList = new ArrayList<>(); // 리스트 생성

        for (int i = 0; i < k; i++) {
            int input = Integer.parseInt(br.readLine());
            if (i != 0 && input == 0) {
                numList.remove(numList.size() - 1); // 마지막 요소 제거
            } else {
                numList.add(input); // 요소 추가
            }
        }

        int sum = 0;

        for (int num : numList) {
            sum += num;
        }

        System.out.println(sum);
    }
}
