package array;

import java.util.Scanner;

public class ArrEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] scores = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};
        for (int row = 0; row < 4; row++) {
            System.out.println(row + 1 + "번 학생의 성적을 입력하세요.");
            for (int col = 0; col < 3; col++) {
                System.out.print(subjects[col] + ": ");
                scores[row][col] = sc.nextInt();
            }
        }

        for (int row = 0; row < 4; row++) {
            System.out.println(row + 1 + "번 학생의 총점과 평균을 출력합니다.");
            int total = 0;
            for (int col = 0; col < 3; col++) {
                total += scores[row][col];
            }
            double average = (double) total / 3;
            System.out.println("총점: " + total);
            System.out.println("평균: " + average);
        }
    }
}
