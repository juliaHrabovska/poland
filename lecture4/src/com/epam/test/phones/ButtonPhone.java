package com.epam.test.phones;

import java.util.List;

import static java.util.Arrays.asList;

public class ButtonPhone extends AbstractPhone {
    private List<String> numbers = asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+");

    public ButtonPhone(int year) {
        super(year);
    }

    @Override
    public void call(String outputNumber) {
        System.out.println("Dial the number");
        System.out.println("Call");
    }

    @Override
    public void ring(String inputNumber) {
        System.out.println("Ring");
    }
}
