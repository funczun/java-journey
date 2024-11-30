package array;

import java.util.Scanner;

public class ArrEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 수를 입력하세요.");

        int n = sc.nextInt();
        String[] subjects = {"국어", "영어", "수학"};
        int[][] scores = new int[n][subjects.length];
        for (int row = 0; row < n; row++) {
            System.out.println(row + 1 + "번 학생의 성적을 입력하세요.");
            for (int col = 0; col < subjects.length; col++) {
                System.out.print(subjects[col] + ": ");
                scores[row][col] = sc.nextInt();
            }
        }

        for (int row = 0; row < n; row++) {
            System.out.println(row + 1 + "번 학생의 총점과 평균을 출력합니다.");
            int total = 0;
            for (int col = 0; col < subjects.length; col++) {
                total += scores[row][col];
            }
            double average = (double) total / subjects.length;
            System.out.println("총점: " + total);
            System.out.println("평균: " + average);
        }
    }
}
