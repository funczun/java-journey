import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem1389 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        int minCount = Integer.MAX_VALUE;
        int personNum = 0;

        for (int i = 1; i <= n; i++) {
            int count = bfs(i, n, graph);

            if (count < minCount) {
                minCount = count;
                personNum = i;
            }
        }

        System.out.println(personNum);
    }

    private static int bfs(int i, int n, ArrayList<Integer>[] graph) {
        Queue<Integer> queue = new LinkedList<>();
        int[] distance = new int[n + 1];
        Arrays.fill(distance, -1);

        distance[i] = 0;
        queue.offer(i);

        int count = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int neighbor : graph[current]) {
                if (distance[neighbor] == -1) {
                    distance[neighbor] = distance[current] + 1;
                    count += distance[neighbor];

                    queue.offer(neighbor);
                }
            }
        }
        return count;
    }
}
