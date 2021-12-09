package com.epam.test.abstractclass;

public abstract class Car {

    private String model;
    private String color;
    private int maxSpeed;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

//    public abstract void go();

    public abstract void stop();

    public void go() {
        System.out.println("Car goes");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
