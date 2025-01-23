package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today is " + today);

        boolean supported = today.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println(supported);

        if (supported) {
            System.out.println("supported = " + supported);
        } else {
            System.out.println("not supported");
        }
    }
}
