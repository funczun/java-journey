// https://www.acmicpc.net/problem/12789

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Problem12789 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Stack<Integer> stack = new Stack<>();

        int targetOrder = 1;

        while (st.hasMoreTokens()) {
            if (!stack.isEmpty()) {
                if (stack.peek() == targetOrder) {
                    stack.pop();
                    targetOrder++;
                    continue;
                }
            }

            int inputOrder = Integer.parseInt(st.nextToken());

            if (inputOrder == targetOrder) {
                targetOrder++;
            } else {
                stack.push(inputOrder);
            }
        }

        if (!stack.isEmpty()) {
            int tryCount = stack.size();

            while (tryCount-- > 0) {
                if (stack.peek() == targetOrder) {
                    stack.pop();
                    targetOrder++;
                } else {
                    System.out.println("Sad");
                    return;
                }
            }
        }

        System.out.println("Nice");
    }
}
