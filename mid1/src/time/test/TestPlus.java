package time.test;

import java.time.LocalDateTime;
import java.time.Period;

public class TestPlus {

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2024,1,1,0,0,0);
        Period period = Period.of(1,2,3);

        System.out.println("기준 시각: " + ldt);
        System.out.println("1년 2개월 3일 4시간 후의 시각: " + ldt.plus(period).plusHours(4));
    }
}
