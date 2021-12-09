package com.epam;

public class IfElse {

    public static void main(String[] args) {
        example1();
        example2();
        example3();
        example4();
    }

    private static void example1() { // simple if else statement
//        int count = 2;
//        int count = 3;
        int count = 4;
        int total = 0;

        if (count < 3) {
            total = 0;
        } else {
            total = total + count;
//            total += count;
//            total -= count;
        }
        System.out.println(total);
    }

    private static void example2() { // multiple statements
        int count = 10;
        int total = 0;

        if (count < 3) {
            total = 0;
        } else {
            total = total + count;
            count = count - 1;
//            count++";
//            count--;
        }
        System.out.println(total);
    }

    private static void example3() { // omitting the else part
        int count = -10;

        if (count < 3) {
            System.out.println("Count is less then 3");
        }
    }

    private static void example4() { // ternary operator
        int hours = 8;
        if (hours == 1) {
            System.out.print("You worked " + hours + " " + "hours");
        } else {
            System.out.print("You worked " + hours + " " + "hour");

        }
        System.out.print("You worked " + hours + " " +
                ((hours > 1) ? "hours" : "hour"));
    }
}
