package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalenderPrinter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        System.out.print("Enter Month: ");
        int month = sc.nextInt();

        printCalender(year, month);
    }

    private static void printCalender(int year, int month) {
        LocalDate date = LocalDate.of(year, month, 1);
        LocalDate endDate = date.plusMonths(1);
        // 월요일 = 1 (1 % 7 = 1) ... 일요일 = 7 (7 % 7 = 0)
        int offset = date.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa");
        for (int i = 0; i < offset; i++) {
            System.out.print("   ");
        }

        LocalDate dayIterator = date;
        while (dayIterator.isBefore(endDate)) {
            System.out.printf("%2d ", dayIterator.getDayOfMonth());
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }
    }
}
