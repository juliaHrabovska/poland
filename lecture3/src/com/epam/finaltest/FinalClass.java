package com.epam.finaltest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public final class FinalClass {
    public final long MAX_AGE = 90;
    public final List<String> elements = new ArrayList<>();

    private FinalClass() {
//        MAX_AGE = 99;
//        elements.add("a");
//        elements.add("b");
//        elements = new LinkedList<>();
    }

    public void effectivelyFinalExample() {
        // a and b are effectively final, the values are set once and are not changed:
        int a = 1;
        int b;
        if (a == 2) {
            b = 3;
        } else {
            b = 4;
        }
        // с isn't effectively final, the value will be changed
        int c = 10;
        c++;

        Stream.of(1, 2).forEach(s -> System.out.println(s + a)); // no error
//        Stream.of(1, 2).forEach(s -> System.out.println(s + c)); // compilation error
    }


    public final void test() {
        System.out.println("Try to override me :p");
    }
}
