package com.epam.test.difference;

public interface Flyable {

    String species = new String(); // not secure
    int age = 10; // not secure

    public void fly();
}

//public interface Flyable {
//
//    private String species = new String(); // error
//    private int age = 10; // error
//
//    public void fly();
//}

