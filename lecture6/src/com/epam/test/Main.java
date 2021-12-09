package com.epam.test;

import com.epam.test.innerclass.innerclass.Bicycle;

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