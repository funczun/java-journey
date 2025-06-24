package etc;// https://www.acmicpc.net/problem/9012

import java.util.Scanner;
import java.util.Stack;

public class Problem9012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            Stack<Character> stack = new Stack<>();

            boolean isOK = true;

            for (int j = 0; j < input.length(); j++) {
                char ch = input.charAt(j);

                if (ch == '(') {
                    stack.push(ch);
                }

                if (ch == ')') {
                    if (stack.isEmpty()) {
                        isOK = false; // ')'가 더 많음
                    } else {
                        stack.pop();
                    }
                }
            }

            if (isOK && stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
