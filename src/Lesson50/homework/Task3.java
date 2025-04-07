package Lesson50.homework;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Task3 {
    public static long between (List<LocalDate> dates){
       LocalDate earliest = dates.stream().min(LocalDate::compareTo).orElseThrow();
       LocalDate lastets = dates.stream().max(LocalDate::compareTo).orElseThrow();

//Сначала сделал return earliest.until(lastets).getDays(), не мог понять как сделать по другому, ИИ обьяснил.Как сделать это используя только то чтобыло на уроке?
       return earliest.until(lastets).getDays() + earliest.until(lastets).getMonths() * 30 + earliest.until(lastets).getYears() * 365;
    }

    public static void main(String[] args) {
        List<LocalDate> dates = List.of(
                LocalDate.of(2025, 4, 1),
                LocalDate.of(2000, 10, 10),
                LocalDate.of(2025, 1, 1)
        );
        long daysBetween = between(dates);
        System.out.println(daysBetween);
    }
}
