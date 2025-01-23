package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {

    public static void main(String[] args) {
        ChronoUnit[] units = ChronoUnit.values();
        for (ChronoUnit unit : units) {
            System.out.println("unit = " + unit);
        }

        System.out.println("ChronoUnit.HOURS = " + ChronoUnit.HOURS);
        System.out.println("ChronoUnit.HOURS.getDuration().getSeconds() = " + ChronoUnit.HOURS.getDuration().getSeconds());
        System.out.println("ChronoUnit.DAYS.getDuration().getSeconds() = " + ChronoUnit.DAYS.getDuration().getSeconds());

        LocalTime lt1 = LocalTime.of(1,10,0);
        LocalTime lt2 = LocalTime.of(2,10,0);
        System.out.println("ChronoUnit.SECONDS.between(lt1, lt2) = " + ChronoUnit.SECONDS.between(lt1, lt2));
    }
}
