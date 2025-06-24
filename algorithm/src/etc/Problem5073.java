package etc;// https://www.acmicpc.net/problem/5073

import java.util.Arrays;
import java.util.Scanner;

public class Problem5073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] angles = new int[3];

        while (true) {
            angles[0] = sc.nextInt();
            angles[1] = sc.nextInt();
            angles[2] = sc.nextInt();

            Arrays.sort(angles);

            if (angles[0] == angles[2] && angles[2] == 0) {
                break;
            }

            if (angles[2] >= angles[0] + angles[1]) {
                System.out.println("Invalid");
                continue;
            }

            if (angles[0] == angles[1] && angles[1] == angles[2]) {
                System.out.println("Equilateral");
            } else if (angles[0] == angles[1] || angles[1] == angles[2]) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
