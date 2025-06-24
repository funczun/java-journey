package etc;// https://www.acmicpc.net/problem/28279

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Problem28279 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            commandDeque(deque, st);
        }
    }

    static void commandDeque(Deque<Integer> deque, StringTokenizer st) {
        String command = st.nextToken();

        switch (command) {
            case "1":
                deque.addFirst(Integer.valueOf(st.nextToken()));
                break;
            case "2":
                deque.addLast(Integer.valueOf(st.nextToken()));
                break;
            case "3":
                if (deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.pollFirst());
                }
                break;
            case "4":
                if (deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.pollLast());
                }
                break;
            case "5":
                System.out.println(deque.size());
                break;
            case "6":
                if (deque.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
                break;
            case "7":
                if (deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.peekFirst());
                }
                break;
            case "8":
                if (deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.peekLast());
                }
                break;
        }
    }
}
