// https://www.acmicpc.net/problem/4949

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem4949 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while (true) {
            str = br.readLine();

            if (str.equals(".")) break; // 종료

            if (isValid(str)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') return false; // 불균형
                stack.pop();
            } else if (c == ']') {
                if (stack.isEmpty() || stack.peek() != '[') return false; // 불균형
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
