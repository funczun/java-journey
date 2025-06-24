package etc;// https://www.acmicpc.net/problem/1018

import java.util.Scanner;

public class Problem1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 행 개수
        int M = sc.nextInt(); // 열 개수
        int result = 64; // 색칠이 가장 적게 필요한 경우 개수

        // 배열의 크기 설정
        char[][] board = new char[N][M];

        // 배열에 보드 대입
        for (int i = 0; i < N; i++) {
            String temp = sc.next();
            for (int j = 0; j < M; j++) {
                board[i][j] = temp.charAt(j);
            }
        }

        // 8 x 8 규격으로 뜯어 계산
        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                int firstB = 0; // 첫 번째 칸이 블랙으로 시작한 경우 블랙 개수
                int secondB = 0; // 두 번째 칸이 블랙으로 시작한 경우 블랙 개수

                // 첫 번째 칸을 무슨 색으로 하는 게 유리한지 확인
                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {
                        if ((k % 2 == 1 && l % 2 == 1) || (k % 2 == 0 && l % 2 == 0)) {
                            if (board[k][l] == 'B') {
                                firstB++;
                            }
                        } else {
                            if (board[k][l] == 'B') {
                                secondB++;
                            }
                        }
                    }
                }
                int needPaint = 0; // 색칠이 필요한 칸의 개수

                // 색칠이 필요한 칸의 개수 계산
                if (firstB >= secondB) {
                    needPaint = 32 - firstB + secondB;
                } else {
                    needPaint = 32 - secondB + firstB;
                }

                // 이번 색칠 요구 수가 더 작은 경우 값 대체
                if (result > needPaint) {
                    result = needPaint;
                }
            }
        }
        System.out.println(result); // 결과 출력
    }
}
