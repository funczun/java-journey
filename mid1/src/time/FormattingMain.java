package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain {

    public static void main(String[] args) {
        // 포맷팅: 날짜 -> 문자
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String newToday = today.format(dateTimeFormatter); // 포맷팅
        System.out.println("newToday = " + newToday);

        // 파싱: 문자 -> 날짜
        String input = "2025년 01월 22일";
        LocalDate parsedDate = LocalDate.parse(input, dateTimeFormatter); // ("yyyy년 MM월 dd일")
        System.out.println("parsedDate = " + parsedDate);

        /*
        yyyy-MM-dd HH:mm:ss
        자주 쓰는 포맷

        yyyy-MM-ddTHH:mm:ss
        표준 출력
        : 0초는 생략한다.
         */
    }
}
