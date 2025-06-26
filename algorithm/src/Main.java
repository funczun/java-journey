import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 기본형: minHeap
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());
            if (value > 0) {
                pq.add(value);
            }
            else if (value == 0) {
                try {
                    sb.append(pq.remove()).append("\n");
                }
                catch (Exception e) {
                    sb.append(0).append("\n");
                }
            }
        }
        System.out.print(sb);
    }
}
