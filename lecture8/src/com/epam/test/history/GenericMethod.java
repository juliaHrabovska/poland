package com.epam.test.history;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {

        public static <T> void fill(List<T> list, T val) {
            for (int i = 0; i < list.size(); i++)
                list.set(i, val);
        }

        public static void main(String[] args) {
            List<String> strings = new ArrayList<>();
            strings.add("Old string 1");
            strings.add("Old string 2");
            strings.add("Old string 3");

            fill(strings, "New string");

            System.out.println(strings);

            List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);

            fill(numbers, 888);
            System.out.println(numbers);
        }
    }
