package etc;// https://www.acmicpc.net/problem/1874

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem1874 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        // 1부터 n까지
        int n = Integer.parseInt(br.readLine());
        int start = 0; // 마지막 push 값

        while (n-- > 0) {
            int value = Integer.parseInt(br.readLine()); // 수열에 pop 할 값

            if (value > start) {
                for (int i = start + 1; i < value + 1; i++) { // 두 값이 같아질 때까지 push
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                start = value; // 마지막 push 값 갱신
            } else if (stack.peek() != value) {
                System.out.println("NO");
                return;
            }

            stack.pop(); // 수열에 추가
            sb.append('-').append('\n');
        }

        System.out.println(sb);
    }
}
