package com.epam.test.stringsmethods.stringbufferandbuilder;

import java.util.List;

import static java.util.Arrays.asList;

public class StringBufferTest {
    public static void main(String[] args) {
        List<String> numbersString = asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");

        StringBuffer sb = new StringBuffer();
        for (String string : numbersString) {
            sb.append(string);
        }
        String numbers = new String(sb);

        System.out.println(sb.substring(3)); // 3456789
        System.out.println(sb.substring(4, 8)); // 4567
        System.out.println(sb.replace(3, 5, "ABCDE")); // 012ABCDE56789

        sb = new StringBuffer(numbers);
        System.out.println(sb.reverse()); // 9876543210
        sb.reverse();

        sb = new StringBuffer(numbers);
        System.out.println(sb.delete(5, 9)); // 012349
        System.out.println(sb.deleteCharAt(1)); // 02349
        System.out.println(sb.insert(1, "One")); // 0One2349
    }
}
