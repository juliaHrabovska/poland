package com.epam.interfacetest.example2;

public class Implementation implements TestInterface1, TestInterface2 {

    @Override
    public void test() {
        System.out.println("implementation of method test");
    }
}
