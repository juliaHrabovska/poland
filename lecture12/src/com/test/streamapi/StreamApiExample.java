package com.test.streamapi;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiExample {
    public static void main(String[] args) {
        String[] array = {"abd", "rtgffdd", "yttreewww", "llllkjpoi"};
        Stream<String> streamOfArray = Arrays.stream(array);
        streamOfArray.map(s -> s.split(""))
                .flatMap(s -> Arrays.stream(s))
                .filter(s -> !s.equals("w"))
                .distinct().sorted().collect(Collectors.toList())
                .forEach(s -> System.out.print(s));

        System.out.println();
        System.out.println("----------------------------------------------------");

        System.out.println(Stream.of(1, 2, 3, 4, 5).reduce(10, (acc, x) -> acc + x));
        System.out.println(Stream.of(1, 2, 3, 4, 9).findFirst());
        System.out.println(Stream.of(1, 2, 3, 4, 9).allMatch(x -> x <= 7));// f
        System.out.println(Stream.of(1, 2, 3, 4, 9).anyMatch(x -> x >= 7));// t
        System.out.println(Stream.of(1, 2, 3, 4, 9).noneMatch(x -> x >= 7));// f
    }
}
