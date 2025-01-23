package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {

    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("now = " + now);

        // 생성
        LocalDateTime localDateTime = LocalDateTime.of(2030,1,21,21,40,50);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("America/Los_Angeles"));
        System.out.println("zonedDateTime = " + zonedDateTime);

        // zone 변경
        ZonedDateTime zonedDateTimeRef = zonedDateTime.withZoneSameInstant(ZoneId.of("Europe/Paris"));
        System.out.println("zonedDateTimeRef = " + zonedDateTimeRef);
    }
}
