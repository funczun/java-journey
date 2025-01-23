package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {

    public static void main(String[] args) {
        int year = 2024;
        int month = 12;

        LocalDate date = LocalDate.of(year, month, 1);
        DayOfWeek dayOfWeekF = date.getDayOfWeek();
        DayOfWeek dayOfWeekL = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();

        System.out.println("firstDayOfWeek = " + dayOfWeekF);
        System.out.println("lastDayOfWeek = " + dayOfWeekL);
    }
}
