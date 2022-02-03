package com.test.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        List<String> collection1 = Arrays.asList("Highload", "High", "Load", "Highload");
//        Count how many times the "High" object occurs in the collection
        collection1.stream().filter(x -> x.equals("High")).count();
//        Get the first element, if a collection is empty return "0"
        collection1.stream().findFirst().orElse("0");
        Optional<String> elem = collection1.stream().findFirst();
        if (elem.isPresent()) {
            System.out.println(elem.get());
        }
//        Get element which contains "Load"
        collection1.stream().filter(x -> x.contains("Load")).collect(Collectors.toList());
//        Get first two elements which contain "High"
        collection1.stream().filter(x -> x.contains("Load")).limit(2);

        List<String> collection2 = Arrays.asList("f10", "f15", "f2", "f4");
//        Find the smallest element
        System.out.println(collection2.stream().min((s1, s2) -> s1.compareTo(s2)));
//        Find the biggest element
        System.out.println(collection2.stream().max(String::compareTo));
//        Sort elements
        collection2.stream().sorted().collect(Collectors.toList());
//        Sort in reverse alphabetical order and remove duplicates
        collection2.stream().sorted((String::compareTo)).distinct().collect(Collectors.toList());
        List<Integer> collection3 = new ArrayList<>();
        int number;
        Random rnd = new Random();

        for (int i=0; i<10; i++) {
            number = rnd.nextInt() % 100;
            collection3.add(number);
        }
//        For a set of randomly generated numbers determine the number of even elements
        collection3.stream().filter(x -> (x % 2) == 0).count();
    }
}
