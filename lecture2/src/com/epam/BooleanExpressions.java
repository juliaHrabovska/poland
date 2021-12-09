package com.epam;

public class BooleanExpressions {

    public static void main(String[] args) {
//        == != > < >= <=
//        && ||

//        example1();
//        example2();
        example3();
//        example4();
    }

    private static void example1() {
        int count = 2;
        int total = 0;

        if (count < 3 && total > -10) {
            System.out.println(total + count);
        } else if (count > 3 || total == 0) {
            System.out.println(total * count);
        }
    }

    private static void example2() {
        System.out.println("true and true = " + (true && true));
        System.out.println("true and false = " + (true && false));
        System.out.println("false and true = " + (false && true));
        System.out.println("false and false = " + (false && false));

        System.out.println("true or true = " + (true || true));
        System.out.println("true or false = " + (true || false));
        System.out.println("false or true = " + (false || true));
        System.out.println("false or false = " + (false || false));
    }

    private static void example3() {
        System.out.println(true || false || false && false && (true || false)); // true
        System.out.println(!(false && false || true || true && false)); // false
    }

    private static void example4() {
        int count = 2;
        int total = 0;

        if (count == total) {
            System.out.println("Same");
        } else {
            System.out.println("Not the same");
        }
    }
}
