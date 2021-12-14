package com.epam.test.stringsmethods.stringbufferandbuilder;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DifferenceStringBuilder {
    public static void main(String[] args) {
        LocalDateTime startTime = LocalDateTime.now();
        evaluatingStringBuilder();
        LocalDateTime endTime = LocalDateTime.now();

        System.out.println(ChronoUnit.SECONDS.between(startTime, endTime));
    }

    private static void evaluatingStringBuilder() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < 100000000; i++) {
            string.append(i);
        }
    }
}
