package com.epam.test.stringsmethods;

public class ConcatAndLength {
    public static void main(String[] args) {
        String str1 = "Hello ";
        String str2 = "World!";
        String str3 = str1 + str2;
        String str4 = str1.concat(str2);
        System.out.println(str3 + str4);
        System.out.println(str3);
        System.out.println(str4);

        int str3Length = str3.length();
        System.out.println(str3Length);
    }
}
