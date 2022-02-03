package com.test.functionalinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaUsageExamples {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        integers.forEach(item -> System.out.println(item));

        System.out.println("--------------------------------------");
        List<String> colors = Arrays.asList("Black", "White", "Red");
        Collections.sort(colors, (o1, o2) -> {
            String o1LastLetter = o1.substring(o1.length() - 1);
            String o2LastLetter = o2.substring(o2.length() - 1);

            return o1LastLetter.compareTo(o2LastLetter);
        });
        System.out.println(colors);

        System.out.println("--------------------------------------");
        final double currencyUsdEur = 0.89d;
        List<Double> pricesUsd = Arrays.asList(25d, 50d, 60d, 12d, 45d, 89d);

        List<Double> pricesUsdGreaterEur = pricesUsd.stream()
                .filter(d -> d > 50)
                .map(d -> d * currencyUsdEur)
                .collect(Collectors.toList());
        System.out.println(pricesUsdGreaterEur);
    }
}
