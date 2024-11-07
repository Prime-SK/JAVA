package zzz;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class days {
    public static void main(String[] args) {
        LocalDate day1 = LocalDate.of(2024, 8, 1);
        LocalDate day2 = LocalDate.of(2024, 8, 6);

        long days = ChronoUnit.DAYS.between(day2, day1);
        System.out.println(days);
    }
}
