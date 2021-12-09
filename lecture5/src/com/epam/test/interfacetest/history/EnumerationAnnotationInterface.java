package com.epam.test.interfacetest.history;

public interface EnumerationAnnotationInterface {
    enum MyEnum {
        FOO, BAR;
    }

    @interface MyAnnotation {
        //...
    }
}
