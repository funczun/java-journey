package etc;// https://www.acmicpc.net/problem/10101

import java.util.Arrays;
import java.util.Scanner;

public class Problem10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] angle = new int[3];
        int total = 0;

        for (int i = 0; i < 3; i++) {
            angle[i] = sc.nextInt();
            total += angle[i];
        }

        Arrays.sort(angle);

        if (total != 180) {
            System.out.println("Error");
        } else {
            if (angle[0] == angle[2]) {
                System.out.println("Equilateral");
            } else if (angle[0] == angle[1] || angle[1] == angle[2]) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
