import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> {
            if (Math.abs(a) == Math.abs(b)) {
                return a - b;
            }
            return Math.abs(a) - Math.abs(b);
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());

            if (value != 0) {
                minHeap.add(value);
            }
            else {
                if (minHeap.isEmpty()) {
                    sb.append(0).append("\n");
                }
                else {
                    sb.append(minHeap.remove()).append("\n");
                }
            }
        }

        System.out.print(sb);
    }
}
