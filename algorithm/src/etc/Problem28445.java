package etc;// https://www.acmicpc.net/problem/28445

import java.util.*;

public class Problem28445 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] colors = (sc.nextLine() + " " + sc.nextLine()).split(" ");
        Arrays.sort(colors);

        for (int i = 0; i < colors.length; i++) {
            if (i > 0 && colors[i].equals(colors[i-1])) {
                continue; // 중복 스킵
            }
            for (int j = 0; j < colors.length; j++) {
                if (j > 0 && colors[j].equals(colors[j-1])) {
                    continue; // 중복 스킵
                }
                System.out.println(colors[i] + " " + colors[j]);
            }
        }
    }
}
