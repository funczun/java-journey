package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 30);

        Period between = Period.between(startDate, endDate);
        long days = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("시작 날짜: " + startDate);
        System.out.println("목표 날짜: " + endDate);
        System.out.println("남은 기간: " + between.getYears() + "년 " + between.getMonths() + "개월 " + between.getDays() + "일");
        System.out.println("디데이: " + days + "일 남음");
    }
}
