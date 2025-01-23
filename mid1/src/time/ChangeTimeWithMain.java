package time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        // 불변일 때 with 키워드
        LocalDateTime with = now.with(ChronoField.YEAR, 2020);
        System.out.println("with = " + with);

        LocalDateTime withAd = now.withYear(2020);
        System.out.println("withAd = " + withAd);

        // TemporalAdjuster 사용
        System.out.println("-> next friday");
        LocalDateTime withTemporal1 = now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("withTemporal1 = " + withTemporal1);

        System.out.println("-> last sunday in this month");
        LocalDateTime withTemporal2 = now.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("withTemporal2 = " + withTemporal2);
    }
}
