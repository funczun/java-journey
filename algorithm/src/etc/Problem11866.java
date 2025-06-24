package etc;// https://www.acmicpc.net/problem/11866

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem11866 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        System.out.print("<");

        while (q.size() > 1) {
            for (int i = 1; i < k; i++) {
                q.add(q.poll());
            }
            System.out.print(q.poll() + ", ");
        }

        System.out.print(q.poll() + ">");
    }
}
