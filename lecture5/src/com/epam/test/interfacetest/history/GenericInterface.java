package com.epam.test.interfacetest.history;

public interface GenericInterface<T> {
    void insert(T item);
}

class IntegerImplementation implements GenericInterface<Integer> {
    public void insert(Integer item) {
        //...
    }
}

class StringImplementation implements GenericInterface<String> {
    public void insert(String item) {
        //...
    }
}
