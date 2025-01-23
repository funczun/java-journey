package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {

    public static void main(String[] args) {
        // 기본
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        // 기간 덧셈
        LocalDate today = LocalDate.now();
        LocalDate todayAdd = today.plus(period);
        System.out.println("오늘로부터 " + period + "일 이후 날짜: " + todayAdd);

        // 기간 차이
        LocalDate birthDay = LocalDate.of(1999,12,4);
        Period between = Period.between(today, birthDay);
        System.out.println("\n기간 차이 = " + between);
        System.out.println(": " + between.getYears() + "년" + between.getMonths() + "개월" + between.getDays() + "일");
    }
}
