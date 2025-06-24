package etc;// https://www.acmicpc.net/problem/4134

import java.io.*;

public class Problem4134 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine()); // 테스트 케이스

        for (int i = 0; i < n; i++) {
            long number = Long.parseLong(br.readLine());
            // 3 미만인 경우 최초 소수 2
            if (number < 3) {
                System.out.println(2);
                continue;
            }
            primeNumber(number);
        }
    }

    static void primeNumber(long number) {
        // 짝수 소수 불가능
        if (number % 2 == 0) {
            number++;
        }
        // 소수 점검
        double sqrt = Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                primeNumber(number + 1); // 값 변경 후 재점검
                return; // 기존 메서드 종료
            }
        }
        System.out.println(number); // 통과 시 출력
    }
}
