package com.epam.test.exceptions;

import java.util.List;

import static java.util.Arrays.asList;

public class Print {

    void print(String s) {
        if (s == null) {
            throw new NullPointerException("Exception: s is null!");
        }
        System.out.println("Inside method print: " + s);
    }

    public static void main(String[] args) {
        Print print = new Print();
        List<String> list = asList("first step", null, "second step");

        for (String s : list) {
            try {
                print.print(s);
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
                System.out.println("Exception was processed. Program continues");
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println();
            } catch (Exception e) {
                System.out.println();
            } finally {
                System.out.println("Inside bloсk finally");
            }
            System.out.println("Go program....");
            System.out.println("-----------------");
        }
    }
}
