package com.epam;

import java.util.Arrays;

public class ArraysClassTest {
    public static void main(String[] args) {
//        example1();
        example2();
//        example3();
//        example4();
    }

    private static void example1() {
        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};

        Arrays.sort(numbers);

        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void example2() {
        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};

        int[] numbersCopyFull = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.toString(numbersCopyFull));

        int[] numbersCopyPart = Arrays.copyOf(numbers, 4);
        System.out.println(Arrays.toString(numbersCopyPart));

        int[] numbersCopyRange = Arrays.copyOfRange(numbers, 2, 6);
        System.out.println(Arrays.toString(numbersCopyRange));
    }

    private static void example3() {
        int[] numbers = {1, 2, 3};
        int[] numbers2 = {1, 2, 3};

        System.out.println(numbers.equals(numbers2));
        System.out.println(Arrays.equals(numbers, numbers2));
    }

    private static void example4() {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] numbersCopy = Arrays.copyOf(numbers, numbers.length);

        System.out.println(Arrays.deepEquals(numbers, numbersCopy));

        System.out.println(Arrays.deepToString(numbersCopy));
    }

}


