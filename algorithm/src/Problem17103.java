// https://www.acmicpc.net/problem/17103

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem17103 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            System.out.println(getGoldbachCount(primeNumbers, N));
        }
    }

    static int[] primeNumbers = getPrimeNumbers();

    static int[] getPrimeNumbers() {
        int[] numbers = new int[1000001];

        numbers[0] = 1;
        numbers[1] = 1;

        for (int i = 2; i < Math.sqrt(numbers.length); i++) {
            for (int j = i * i; j < numbers.length; j += i) {
                numbers[j] = 1;
            }
        }
        return numbers;
    }

    static int getGoldbachCount(int[] numbers, int N) {
        int count = 0;

        for (int i = 0; i <= N / 2; i++) {
            int j = N - i;

            if (numbers[i] == 0 && numbers[j] == 0) {
                count++;
            }
        }
        return count;
    }
}
