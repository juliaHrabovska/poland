package com.test.functionalinterface;

import java.util.function.ToIntBiFunction;

public class MethodWithFunctionalInterfaceParameter {
    private static void processTwoNumbers(int a, int b, ToIntBiFunction<Integer, Integer> function) {
        System.out.println(function.applyAsInt(a, b));
    }

    public static void main(String[] args) {
        ToIntBiFunction<Integer, Integer> biFunction = new ToIntBiFunction<>() {
            @Override
            public int applyAsInt(Integer a, Integer b) {
                return a + b;
            }
        };

        processTwoNumbers(1, 2, biFunction);

        ToIntBiFunction<Integer, Integer> biFunction1 = (a, b) -> a * b;

        processTwoNumbers(1, 2, biFunction1);
    }
}
