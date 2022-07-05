package com.epam.test.innerclasses.innerclass.innerclass;

public class Main {

    public static void main(String[] args) {
        Bicycle mtb = new Bicycle("MTB", 120);
        Bicycle.HandleBar handleBar = mtb.new HandleBar();
        Bicycle.Seat seat = mtb.new Seat();

        seat.up();
        mtb.start();
        handleBar.left();
        handleBar.right();
    }
}