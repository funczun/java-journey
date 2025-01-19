package enumeration.test.ex1;

import java.util.Arrays;
import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        AuthGrade[] grades = AuthGrade.values();

        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요" + Arrays.toString(grades)+ ": ");
        AuthGrade grade = AuthGrade.valueOf(sc.nextLine().toUpperCase()); // 대소문자 구분 X
        System.out.println("당신의 등급은 " + grade.getDescription() + "입니다.");

        AuthGrade.accessMenu(grade);
    }
}
