package com.epam.interfacetest.example2;

public class ImplementationDemo {
    public static void main(String[] args) {
        TestInterface1 obj1 = new Implementation();
        TestInterface2 obj2 = new Implementation();

        obj1.test();
        obj2.test();
    }
}
