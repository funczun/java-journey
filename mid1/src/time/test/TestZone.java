package time.test;

import java.time.*;
import java.util.TimeZone;

public class TestZone {

    public static void main(String[] args) {
        ZonedDateTime seoul = ZonedDateTime.of(LocalDate.of(2024,1,1), LocalTime.of(9,0), ZoneId.of("Asia/Seoul"));
        System.out.println("서울 회의 시간: " + seoul);

        ZonedDateTime london = seoul.withZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println("런던 회의 시간: " + london);

        ZonedDateTime nY = seoul.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("뉴욕 회의 시간: " + nY);
    }
}
