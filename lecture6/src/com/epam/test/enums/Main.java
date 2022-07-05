package com.epam.test.enums;

import java.util.Arrays;

import static com.epam.test.enums.SimpleEnumMonth.JANUARY;

public class Main {
    public static void main(String[] args) {
        SimpleMonth simpleMonth1 = new SimpleMonth("la-la-la", 1234);
        SimpleMonth simpleMonth2 = new SimpleMonth("la-la-la", 1234);

        // ------------------------------------------------------
        MonthBeforeJava5 january = MonthBeforeJava5.JANUARY;
        System.out.println(january);

        // ------------------------------------------------------
        System.out.println(JANUARY);
        System.out.println(SimpleEnumMonth.MARCH);

        SimpleEnumMonth month = SimpleEnumMonth.FEBRUARY;
        System.out.println("month.name()=" + month.name() +
                " month.toString()=" + month.toString() +
                " month.ordinal()=" + month.ordinal());

        String name = "MARCH";
        SimpleEnumMonth marchMonth = SimpleEnumMonth.valueOf(name);
        System.out.println(marchMonth);

        System.out.println(Arrays.toString(SimpleEnumMonth.values()));

        System.out.println(SimpleEnumMonth.class.getSuperclass());

        // ------------------------------------------------------
        System.out.println(TypeEnum.class);
        System.out.println(TypeEnum.INT.getClass() + " " + TypeEnum.INT.getClass().getSuperclass());
        System.out.println(TypeEnum.INTEGER.getClass() + " " + TypeEnum.INTEGER.getClass().getSuperclass());
        System.out.println(TypeEnum.STRING.getClass()  + " " + TypeEnum.STRING.getClass().getSuperclass());
    }
}
