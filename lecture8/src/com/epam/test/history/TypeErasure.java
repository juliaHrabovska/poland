package com.epam.test.history;

import java.util.ArrayList;
import java.util.List;

public class TypeErasure<T> {
    private T value1;
    private T value2;

    public void printValues() {
        System.out.println(value1);
        System.out.println(value2);
    }

    public static <T> TypeErasure<T> createAndAdd2Values(Object o1, Object o2) {
        TypeErasure<T> result = new TypeErasure<>();
        result.value1 = (T) o1;
        result.value2 = (T) o2;
        return result;
    }

    public static void main(String[] args) {
//        Double d = 22.111;
//        String s = "Test String";
//        TypeErasure<Integer> test = createAndAdd2Values(d, s);
//        test.printValues();

        List<String> strings = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        List<GenericMethod> genericMethods = new ArrayList<>();

        System.out.println(strings.getClass() == numbers.getClass());
        System.out.println(numbers.getClass() == genericMethods.getClass());
    }
}
