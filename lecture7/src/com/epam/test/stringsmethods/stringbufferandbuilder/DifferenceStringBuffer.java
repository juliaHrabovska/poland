package com.epam.test.stringsmethods.stringbufferandbuilder;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DifferenceStringBuffer {
    public static void main(String[] args) {
        LocalDateTime startTime = LocalDateTime.now();
        evaluatingStringBuffer();
        LocalDateTime endTime = LocalDateTime.now();

        System.out.println(ChronoUnit.SECONDS.between(startTime, endTime));
    }

    private static void evaluatingStringBuffer() {
        StringBuffer string = new StringBuffer();
        for (int i = 0; i < 100000000; i++) {
            string.append(i);
        }
    }
}
