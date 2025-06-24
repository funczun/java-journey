package etc;// https://www.acmicpc.net/problem/1269

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Problem1269 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int countA = Integer.parseInt(st.nextToken()), countB = Integer.parseInt(st.nextToken());

        HashSet<Integer> groupA = new HashSet<>();
        int totalCount = countA + countB;
        int duplicateCount = 0;

        st = new StringTokenizer(br.readLine());
        while (countA-- > 0) {
            groupA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        while (countB-- > 0) {
            if (groupA.contains(Integer.parseInt(st.nextToken()))) {
                duplicateCount++;
            }
        }

        System.out.println(totalCount - (2 * duplicateCount));
    }
}
