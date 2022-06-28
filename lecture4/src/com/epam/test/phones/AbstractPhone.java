package com.epam.test.phones;

public abstract class AbstractPhone {
    private int year;

    public AbstractPhone(int year) {
        this.year = year;
    }

    public abstract void call(String outputNumber) throws InterruptedException;

    public abstract void ring(String inputNumber);
}
