package com.test.other;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateExamples {
    public static void main(String[] args) {
        // get the current date
        LocalDate date = LocalDate.now();
        System.out.println(date);

        // get the current time
        LocalTime time = LocalTime.now();
        System.out.println(time);

        // get the current date and time
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datetime);

        // format date
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println(dateFormat.format(date));

        // get duration
        LocalDateTime from = LocalDateTime.of(2021, Month.NOVEMBER, 23, 19, 0, 0);
        LocalDateTime to = LocalDateTime.of(2022, Month.FEBRUARY, 3, 20, 46, 0);

        Duration duration = Duration.between(from, to);
        System.out.println("Duration in days: " + duration.toDays());
        System.out.println("Duration in hours: " + duration.toHours());
    }
}
