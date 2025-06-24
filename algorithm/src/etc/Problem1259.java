package etc;// https://www.acmicpc.net/problem/1259

import java.io.*;

public class Problem1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();
            // StringBuilder 클래스의 reverse() 메서드 사용
            String reversedInput = new StringBuilder(input).reverse().toString();

            if (input.equals("0")) {
                break;
            }
            if (input.equals(reversedInput)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
