package com.epam.test.interfacetest.history;

public interface DefaultMethodInterface {
    default int doSomething() {
        return 0;
    }
}
