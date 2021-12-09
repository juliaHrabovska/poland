package com.epam.test.abstractclass;

public class Sedan extends Car {

    public Sedan(String model, String color) {
        super(model, color);
    }

    @Override
    public void go() {
        System.out.println("Sedan goes");
    }

    @Override
    public void stop() {
        System.out.println("Sedan stops");
    }

}
