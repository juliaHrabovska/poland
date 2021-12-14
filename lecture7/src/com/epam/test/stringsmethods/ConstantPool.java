package com.epam.test.stringsmethods;

public class ConstantPool {
    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");

        System.out.println("s1 == s2 :" + (s1 == s2)); // true
        System.out.println("s1 == s3 :" + (s1 == s3)); // false
        String s4 = s3.intern();
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));

    }
}
