// https://www.acmicpc.net/problem/7785

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem7785 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashSet<String> currentPeople = new HashSet<>();

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String command = st.nextToken();

            if (command.equals("enter")) {
                currentPeople.add(name);
            } else if (command.equals("leave")) {
                currentPeople.remove(name);
            }
        }

        ArrayList<String> people = new ArrayList<>(currentPeople);

        people.sort(Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < people.size(); i++) {
            sb.append(people.get(i));
            if (i < people.size() - 1) {
                sb.append(" ");
            }
        }

        System.out.println(sb);
    }
}
