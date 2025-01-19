package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {
        // 모든 enum 반환
        Grade[] grades = Grade.values();
        System.out.println("grades = " + Arrays.toString(grades));

        for (Grade grade : grades) {
            System.out.println(grade.name()); // 이름
            System.out.println(grade.ordinal()); // 순서
        }

        // String -> enum 변환
        String input = "GOLD";
        Grade GOLD = Grade.valueOf(input);
        System.out.println("Grade.valueOf(input): " + GOLD.name());
    }
}
