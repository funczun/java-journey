package time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        LocalDateTime nowPlus = now.plus(1, ChronoUnit.YEARS);
        System.out.println("nowPlus = " + nowPlus);
        LocalDateTime nowMinus = now.minus(1, ChronoUnit.YEARS);
        System.out.println("nowMinus = " + nowMinus);

        LocalDateTime nowPlus2 = now.plusYears(1);
        System.out.println("nowPlus2 = " + nowPlus2);
        LocalDateTime nowMinus2 = now.minusYears(1);
        System.out.println("nowMinus2 = " + nowMinus2);

        // Period, Duration 사용 가능
        Period period = Period.ofDays(20);
        LocalDateTime nowPlusWithPeriod = now.plus(period);
        System.out.println("nowPlusWithPeriod = " + nowPlusWithPeriod);
    }
}
