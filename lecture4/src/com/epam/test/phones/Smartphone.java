package com.epam.test.phones;

public class Smartphone extends CellPhone {
    private String operationSystem;

//    public Smartphone() {
//
//    }

    public Smartphone(int year, int hours) {
        super(year, hours);
    }

    public Smartphone(int year, int hours, String operationSystem) {
        this(year, hours);
        this.operationSystem = operationSystem;
    }

    @Override
    public void ring(String inputNumber) {
        super.ring(inputNumber);
        System.out.println("Show input number " + inputNumber);
    }

    public void ring(String inputNumber, String melody) {
        ring(inputNumber);
        System.out.println("Play melody " + melody);
    }

    public void install(String program){
        System.out.println("Installing " + program + " for " + operationSystem);
    }

}
