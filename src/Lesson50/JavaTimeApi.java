package Lesson50;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class JavaTimeApi {
    public static void main(String[] args) {

        /*
        util.DAte

         */
        LocalDate date = LocalDate.now();// текущая дата
        System.out.println("date: " + date);

        LocalDate tomorrow = date.plusDays(1);
        System.out.println("tomorrow: " + tomorrow);
        System.out.println("plusWeks: " + date.plusWeeks(4));
        System.out.println("minusMonth: " + date.minusMonths(2));
        LocalDate date1 = LocalDate.of(2002 , 2 , 15);
        System.out.println("date1: " + date1 );

        date1 = LocalDate.of(2002 , Month.FEBRUARY , 15);
        System.out.println("date1: " + date1 );
        System.out.println("Год: " + date.getYear() + "; Месяц: " + date.getMonth()+ "; месяц-цифра: " + date.getMonthValue());
        System.out.println("число: " + date.getDayOfMonth() + "; день недели: " + date.getDayOfWeek() + "; деньгода: " + date.getDayOfYear());
        System.out.println("сколько дней в месяце: " + date.lengthOfMonth() + "; дней в году: " + date.lengthOfYear() + "; высокосный?:  " +  date.isLeapYear());

        String dateString = "2000-10-25";
        LocalDate date2 = LocalDate.parse(dateString);
        System.out.println(date2.getDayOfMonth() + " : " + date2.getMonthValue());

        System.out.println("\n\n\n ======================localTime================");
        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime time1 = LocalTime.of(21 ,33);
         time1 = LocalTime.of(21 ,33 , 44);
         time1 = LocalTime.of(21 ,33 , 44 , 54875);
        System.out.println(time1);
        LocalTime time2 = time.plusHours(1);
        System.out.println(time2);
        System.out.println(time.plusMinutes(65));
        System.out.println(time.minusSeconds(30));
        System.out.println(time.getHour()+ " | " + time.getMinute() + " | " + time.getSecond() + " | " + time.getNano() );
        String timeString = "12:13:45";
        LocalTime parseTime = LocalTime.parse(timeString);
        System.out.println(parseTime);


        System.out.println("\n\n\n\n===========================LocalDateTime===========================");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now: " + now);
        LocalDate localDate = LocalDate.of(2011 , Month.AUGUST , 15);
        LocalTime localTime  = LocalTime.of(15 , 22 , 59);
        LocalDateTime dateTime = LocalDateTime.of(localDate , localTime);
        System.out.println("dateTime: " + dateTime);
        dateTime =LocalDateTime.of(2025 , 12,31,23,59);
        System.out.println(dateTime.getDayOfWeek());
        System.out.println(dateTime.getDayOfWeek().getValue());
        System.out.println(dateTime.plusHours(1));
        System.out.println(dateTime.minusYears(1));

        System.out.println("\n\n\n========================== ZonedDateTime==========================");
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime + " | " + zonedDateTime.getZone());

        System.out.println("\n ======== isAfter ,  isBefore , until , equals=======");
        LocalDate date3 = LocalDate.of(2020 ,10 ,16);
        LocalDate date4 = LocalDate.of(2020 , 6 ,25);


         boolean isAfter = date3.isAfter(date4);
        System.out.println(isAfter);
        System.out.println(date3.isBefore(date4));
        // equals
        System.out.println(date3.equals(date4));
        System.out.println(date3.equals(date4));
        // until - метод измеряет время между текущим и указанным даты/времени
        long between = date3.until(date4 , ChronoUnit.DAYS);
        System.out.println("between " + between);
        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = dateTime1.minusDays(15);
        System.out.println(dateTime2.until(dateTime1,ChronoUnit.SECONDS));
        System.out.println(dateTime2.until(dateTime1,ChronoUnit.DAYS));

        LocalDateTime dateTime3 = dateTime1.plus(10 , ChronoUnit.DAYS);//minus
        System.out.println(dateTime3);
        long hoursBetween = ChronoUnit.HOURS.between(dateTime1 , dateTime2);
        System.out.println(hoursBetween);

        Instant nowInstant = Instant.now();
        long millis = nowInstant.toEpochMilli();
        System.out.println(millis);
        Instant instant  = Instant.ofEpochMilli(millis);
        System.out.println(instant);

        System.out.println("\n\n =================== DateTimeFormator================");

        LocalDateTime nowLDT = LocalDateTime.now();
        System.out.println("nowLDT: " + nowLDT);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedString = nowLDT.format(formatter);
        System.out.println(formattedString);
        /*
        y - год
        M - Месяц
        d - день
        H - час в формате от 0 ло 23
        р - час в формате от 0 до 12
        m - миинута
        s - секунда

        Количество повторяющихся символов определяет формат
        yyyy - 4-ч значный год
        yy - двухзначный год 2023 = 23
        M - месяц в формате 2 - 12
        MM - месяц в формате 02 - 12
        d - сырой номер дня -> "3", "29"
        dd - двухзначный день -> "03", "29"




         */

        String dataForParse = "23-10-26 19:15";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm");
        LocalDateTime parseDAte = LocalDateTime.parse(dataForParse,formatter1);
        System.out.println(parseDAte);

        String dateStr1 = "15-12-2022 20-46";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        LocalDateTime parseDate2 = LocalDateTime.parse(dateStr1 , formatter2);
        System.out.println(parseDate2.getMonth());
        System.out.println(parseDate2.getDayOfYear());
        System.out.println(parseDate2.getHour());
        String dateStr2 = "13-01-2023 00-47";
        LocalDateTime parseDate3 = LocalDateTime.parse(dateStr2,formatter2);
        System.out.println(parseDate3.getDayOfWeek());
        System.out.println(parseDate3.until(parseDate2 , ChronoUnit.DAYS));







    }
}
