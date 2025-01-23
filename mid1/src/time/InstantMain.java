package time;

import java.time.Instant;

public class InstantMain {

    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("now = " + now);

        Instant epochTest0 = Instant.ofEpochSecond(0);
        System.out.println("epochTest0 = " + epochTest0);

        long epochSecond = now.getEpochSecond();
        System.out.println("epochSecond = " + epochSecond);
    }
}
