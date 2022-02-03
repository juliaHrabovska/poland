package com.test.streamapi;

import java.util.stream.Stream;

public class CompareStreamAndCycle {
    public static void main(String[] args) {
        Stream.of(50, 60, 70, 80, 90, 100, 110, 120).filter(x -> x < 90).map(x -> x + 10)
                .limit(3).forEach(System.out::print);

        System.out.println();

        int[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
        int count = 0;
        for (int x : arr) {
            if (x >= 90) {
                continue;
            }
            x += 10;
            count++;
            if (count > 3) {
                break;
            }
            System.out.print(x);
        }
    }
}
