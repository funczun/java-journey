package time;

import java.time.ZoneId;

public class ZoneIdMain {

    public static void main(String[] args) {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println("availableZoneId = " + availableZoneId);
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println("zoneId = " + zoneId + " | " + zoneId.getRules());
        }

        // 내 운영체제 기준
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault() = " + zoneId);
    }
}
