// https://www.acmicpc.net/problem/2744

import java.util.Scanner;

public class Problem2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            int temp = word.charAt(i);

            if (temp <= 90) {
                temp += 32;
            } else {
                temp -= 32;
            }
            System.out.print((char) temp);
        }
    }
}
