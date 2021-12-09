package com.epam.test.interfacetest.history;

public interface StaticMethodInterface {
    // This works
    static int foo() {
        return 0;
    }

    // This does not work,
    // static methods in interfaces need body
//        static int bar();
}
