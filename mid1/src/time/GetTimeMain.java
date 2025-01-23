package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2030,2,21,13,30,59);
        System.out.println("dt.get(ChronoField.DAY_OF_YEAR) = " + dt.get(ChronoField.DAY_OF_YEAR));
        System.out.println("dt.get(ChronoField.DAY_OF_MONTH) = " + dt.get(ChronoField.DAY_OF_MONTH)); // 일반적

        // 권장
        System.out.println("편의 메서드 제공");
        System.out.println("YEAR = " + dt.getYear());
        System.out.println("MONTH = " + dt.getMonth());
        System.out.println("MONTH_VALUE = " + dt.getMonthValue()); // 숫자 반환

        System.out.println("편의 메서드 미제공");
        System.out.println("MINUTE_OF_DAY = " + dt.getMinute()); // 표현 불가능
        System.out.println("MINUTE_OF_DAY = " + dt.get(ChronoField.MINUTE_OF_DAY)); // 가능
    }
}
