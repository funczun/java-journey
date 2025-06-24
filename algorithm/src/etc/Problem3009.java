package etc;// https://www.acmicpc.net/problem/3009

import java.util.Scanner;

public class Problem3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] xArray = new int[3];
        int[] yArray = new int[3];

        int x = 0;
        int y = 0;

        for (int i = 0; i < 3; i++) {
            xArray[i] = sc.nextInt();
            yArray[i] = sc.nextInt();
        }

        if (xArray[0] == xArray[1]) {
            x = xArray[2];
        } else {
            if (xArray[0] == xArray[2]) {
                x = xArray[1];
            } else {
                x = xArray[0];
            }
        }

        if (yArray[0] == yArray[1]) {
            y = yArray[2];
        } else {
            if (yArray[0] == yArray[2]) {
                y = yArray[1];
            } else {
                y = yArray[0];
            }
        }

        System.out.print(x + " " + y);
    }
}
