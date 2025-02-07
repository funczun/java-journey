// https://www.acmicpc.net/problem/1620

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Problem1620 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> pokemonBook = new HashMap<>();
        HashMap<String, Integer> pokemonNumber = new HashMap<>();

        for (int i = 1; i < n + 1; i++) {
            String pokemon = br.readLine();
            pokemonBook.put(i, pokemon);
            pokemonNumber.put(pokemon, i);
        }

        while (m-- > 0) {
            String input = br.readLine();

            try {
                int number = Integer.parseInt(input);
                sb.append(pokemonBook.get(number));
            } catch (NumberFormatException e) {
                sb.append(pokemonNumber.get(input));
            }
            if (m > 0) {
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
}
