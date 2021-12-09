package com.epam;

public class StringComparison {
    public static void main(String[] args) {
//        example1();
//        example2();
//        example3();
        example4();
    }

    private static void example1() {
        String a = "a";
        String a1 = "a";

        System.out.println(a == a1);
    }

    private static void example2() {
        String a = new String("a");
        String a1 = new String("a");

        System.out.println(a == a1);
    }

    private static void example3() {
        String a = new String("A");
        String a1 = new String("a");

//        System.out.println(a.equals(a1));
//        System.out.println(a1.equals(a));
        System.out.println(a.equalsIgnoreCase(a1));
    }

    private static void example4() {
        Integer.compare(1, 2);
        String s1 = "Hello";// Hello
        String lowerS1 = s1.toLowerCase(); // hello
        String s2 = "hello";
        if (lowerS1.compareTo(s2) == 0) {
            System.out.println("Equal!");
        }
//        s1.compareToIgnoreCase(s2)
        System.out.println("I".compareTo("J"));
        System.out.println("I".compareTo("A"));
        System.out.println("J".compareTo("I"));
    }
}
