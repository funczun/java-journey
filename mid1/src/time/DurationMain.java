package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {

    public static void main(String[] args) {
        Duration duration = Duration.ofSeconds(100);
        System.out.println("duration = " + duration);

        LocalTime localTime = LocalTime.of(1,0,0);
        System.out.println("localTime = " + localTime);

        LocalTime localTimePlus = localTime.plus(duration);
        System.out.println("localTimePlus = " + localTimePlus);

        // 주의사항: to, toPart
        Duration between = Duration.between(localTime, localTimePlus);
        System.out.println(between.toHours() + "시간 " + between.toMinutes() + "분 " + between.toSeconds() + "초");
        System.out.println(between.toHours() + "시간 " + between.toMinutesPart() + "분 " + between.toSecondsPart() + "초");
    }
}
