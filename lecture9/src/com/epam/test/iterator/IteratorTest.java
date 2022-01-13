package com.epam.test.iterator;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {
        iterateList();
        iterateSet();
        iterateMap();
    }

    private static void iterateList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer item = iterator.next();
            System.out.println(item);
        }
    }

    private static void iterateSet() {
        TreeSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("B");
        set.add("C");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }

        for (String item : set) {
            System.out.println(item);
        }
    }

    private static void iterateMap() {
        Map<String, String> gfg = new HashMap<>();
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "quiz.geeksforgeeks.org");

        for (Map.Entry<String, String> entry : gfg.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }
}
