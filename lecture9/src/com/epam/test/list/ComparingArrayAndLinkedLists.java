package com.epam.test.list;

import java.util.*;

public class ComparingArrayAndLinkedLists {
    public static void main(String[] args) {
//        exampleLinkedList();
//        exampleArrayList();
        getTimeMsOfInsert(new ArrayList<>());
        getTimeMsOfInsert(new LinkedList<>());
    }

    private static void exampleLinkedList() {
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < 5_000_000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            list.add(2_000_000, Integer.MAX_VALUE);
        }
        System.out.println("Time is needed for LinkedList (milliseconds) = " + (System.currentTimeMillis() - start));
    }

    private static void exampleArrayList() {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5_000_000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            list.add(2_000_000, Integer.MAX_VALUE);
        }
        System.out.println("Time is needed for ArrayList (milliseconds) = " + (System.currentTimeMillis() - start));
    }

    public static void getTimeMsOfInsert(List<Object> list) {
        Date currentTime = new Date();
        insert1000000(list);
        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println("Result in milliseconds: " + msDelay);
    }

    public static void insert1000000(List<Object> list) {
        for (int i = 0; i < 1000000; i++) {
            list.add(0, new Object());
        }
    }
}
