package com.epam.interfacetest.example3;

public interface Runner {
    default void run(int hour) {
        int seconds = calculateTimeInSeconds(hour);
        for (int i = 1; i < seconds; i++) {
            System.out.println("step:" + i);
        }
    }

    private int calculateTimeInSeconds(int hour) {
        return hour * 60 * 60;
    }

    static void start() {
        log("We are started", "INFO");
    }

    static void finish() {
        log("We are late", "FATAL");
    }

    private static void log(String message, String msgPrefix) {
        System.out.println(msgPrefix + " : " + message);
    }
}

