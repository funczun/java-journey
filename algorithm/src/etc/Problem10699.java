package etc;// https://www.acmicpc.net/problem/10699

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Problem10699 {
    public static void main(String[] args) {
        ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        LocalDate seoulDate = seoulDateTime.toLocalDate();
        System.out.println(seoulDate);
    }
}
