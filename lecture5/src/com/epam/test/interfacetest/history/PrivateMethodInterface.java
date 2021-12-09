package com.epam.test.interfacetest.history;

public interface PrivateMethodInterface {
    private static int staticMethod() {
        return 42;
    }

    private int nonStaticMethod() {
        return 0;
    }

}
