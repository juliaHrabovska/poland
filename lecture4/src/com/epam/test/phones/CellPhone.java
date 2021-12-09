package com.epam.test.phones;

public class CellPhone extends WirelessPhone {
    public CellPhone(int year, int hour) {
        super(year, hour);
    }

    @Override
    public void call(String outputNumber) {
        System.out.println("Dial the number");
        System.out.println("Call");
    }

    @Override
    public void ring(String inputNumber) {
        System.out.println("Ring");
        System.out.println("Vibrate");
    }
}
