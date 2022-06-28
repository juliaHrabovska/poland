package com.epam.test.phones;

import java.util.List;

import static java.util.Arrays.asList;

public class ButtonPhone extends AbstractPhone {
    private List<String> numbers = asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+");

    public ButtonPhone(int year) {
        super(year);
    }

    @Override
    public void call(String outputNumber) throws NumberFormatException { // add new Exception (Runtime exception)
        try { // removing exception from throws section handling error by try catch bloc
            System.out.println("Dial the number");
            System.out.println("Call");
            throw new InterruptedException(); // emulate the error
        } catch (InterruptedException e) {
            System.err.println("Something went wrong");
        }
    }

    @Override
    public void ring(String inputNumber) {
        System.out.println("Ring");
    }
}
