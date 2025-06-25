import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int S = 0;
        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("add")) {
                int value = Integer.parseInt(st.nextToken());
                S |= (1 << value);
            }
            else if (command.equals("remove")) {
                int value = Integer.parseInt(st.nextToken());
                S &= ~(1 << value);
            }
            else if (command.equals("check")) {
                int value = Integer.parseInt(st.nextToken());
                sb.append((S & (1 << value)) != 0 ? 1 : 0).append("\n");
            }
            else if (command.equals("toggle")) {
                int value = Integer.parseInt(st.nextToken());
                S ^= (1 << value);
            }
            else if (command.equals("all")) {
                S = (1 << 21) - 1;
            }
            else if (command.equals("empty")) {
                S = 0;
            }
        }
        System.out.print(sb);
    }
}
