package com.epam.test.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
//        hashMapExample();
        linkedHashMapExample();
        treeMapExample();
    }

    private static void hashMapExample() {
        Map<Integer, String> passportsAndNames = new HashMap<>();

        // put values in a map
        passportsAndNames.put(212133, "Pearson 1");
        passportsAndNames.put(162348, "Pearson 2");
        passportsAndNames.put(8082771, "Pearson 3");
        System.out.println(passportsAndNames);

        // update a value for the key
        passportsAndNames.put(162348, "Pearson 4");
        System.out.println(passportsAndNames);

        // get element by key
        String pearson1 = passportsAndNames.get(212133);
        System.out.println(pearson1);

        // remove element
        passportsAndNames.remove(162348);
        System.out.println(passportsAndNames);

        // check if the key is present
        System.out.println(passportsAndNames.containsKey(11111));
        // check if the value is present
        System.out.println(passportsAndNames.containsValue("Pearson 3"));
    }

    private static void linkedHashMapExample() {
        Map<Integer, String> passportsAndNames = new LinkedHashMap<>();

        passportsAndNames.put(8082771, "Pearson 3");
        passportsAndNames.put(212133, "Pearson 1");
        passportsAndNames.put(162348, "Pearson 2");
        System.out.print("LinkedHashMap: ");
        System.out.println(passportsAndNames);
    }

    private static void treeMapExample() {
        Map<Integer, String> passportsAndNames = new TreeMap<>();

        passportsAndNames.put(212133, "Pearson 1");
        passportsAndNames.put(162348, "Pearson 2");
        passportsAndNames.put(8082771, "Pearson 3");
        System.out.print("TreeMap: ");
        System.out.println(passportsAndNames);
    }
}
