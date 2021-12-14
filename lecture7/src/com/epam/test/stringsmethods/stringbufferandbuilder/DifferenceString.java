package com.epam.test.stringsmethods.stringbufferandbuilder;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DifferenceString {
    public static void main(String[] args) {
        LocalDateTime startTime = LocalDateTime.now();
        evaluatingString();
        LocalDateTime endTime = LocalDateTime.now();

        System.out.println(ChronoUnit.SECONDS.between(startTime, endTime));
    }

    private static void evaluatingString() {
        String string = "";
        for (int i = 0; i < 100000000; i++) {
            string = string + i;
        }
    }
}
