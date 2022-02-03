package com.test.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class ExamplesForBasicFunctionalInterfaces {
    public static void main(String[] args) {
        predicate();
        consumer();
        supplier();
        function();
        unaryOperator();
    }

    private static void predicate() {
        Predicate<Integer> isEvenNumber = x -> x % 2 == 0;

        System.out.println(isEvenNumber.test(4));
        System.out.println(isEvenNumber.test(3));
    }

    private static void consumer() {
        Consumer<String> greetings = x -> System.out.println("Hello " + x + " !!!");
        greetings.accept("Elena");
    }

    private static void supplier() {
        List<String> nameList = new ArrayList<>();
        nameList.add("Elena");
        nameList.add("John");
        nameList.add("Alex");
        nameList.add("Jim");
        nameList.add("Sara");

        Supplier<String> randomName = () -> {
            int value = (int) (Math.random() * nameList.size());
            return nameList.get(value);
        };

        System.out.println(randomName.get());
    }

    private static void function() {
        Function<String, Integer> valueConverter = x -> Integer.valueOf(x);
        System.out.println(valueConverter.apply("678"));
    }

    private static void unaryOperator() {
        UnaryOperator<Integer> squareValue = x -> x * x;
        System.out.println(squareValue.apply(9));
    }
}
