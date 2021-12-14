package com.epam.test.stringsmethods;

public class ParseNumbers {
    public static void main(String[] args) {
        Integer i = Integer.parseInt("12");
        Double d = Double.parseDouble("12.65D");

        System.out.println(i); // 12
        System.out.println(d); // 12.65
    }
}
