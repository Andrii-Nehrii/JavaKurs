package Lesson50.homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Task2 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear() + " | " + localDate.getMonth() + " | " + localDate.getDayOfYear());
        LocalDate myDate = LocalDate.of(2005 , 12 , 11);
        LocalDate annaDate = LocalDate.of(2005 , 10 ,31);
        System.out.println(myDate.equals(annaDate));
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalTime localTime2 = localTime.plus(3 , ChronoUnit.HOURS );
        System.out.println(localTime2);
        LocalDate localdate1 = localDate.plus(1 , ChronoUnit.WEEKS);
        LocalDate localdate2 = localDate.minus(1 , ChronoUnit.YEARS);
        LocalDate localdate3 = localDate.plus(1 , ChronoUnit.YEARS);
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        LocalDate yesterday = today.minusDays(1);
        System.out.println(tomorrow.isAfter(today));
        System.out.println(yesterday.isBefore(today));



    }
}
