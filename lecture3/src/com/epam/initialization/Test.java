package com.epam.initialization;

public class Test {
    static int staticVariable;
    int nonStaticVariable;

    // Static initialization block:
    // Runs once (when the class is initialized)
    static {
        System.out.println("Static initialization");
        staticVariable = 5;
    }

    // Instance initialization  block:
    // Runs each time you instantiate an object
    {
        System.out.println("Instance initialization");
        nonStaticVariable = 7;
    }

    public Test() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new Test();
        new Test();
    }
}
