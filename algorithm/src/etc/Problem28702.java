package etc;// https://www.acmicpc.net/problem/28702

import java.util.Scanner;

public class Problem28702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nextNum = 0;

        for (int i = 0; i < 3; i++) {
            String str = sc.nextLine();

            // 마지막 문자로 숫자 구분
            if (str.charAt(str.length() - 1) != 'z') {
                int temp = Integer.parseInt(str);
                nextNum = temp + (3 - i);
            }
        }

        // 규칙에 맞게 변환
        if (nextNum % 3 == 0 && nextNum % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (nextNum % 3 == 0) {
            System.out.println("Fizz");
        } else if (nextNum % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(nextNum);
        }
    }
}
