package com.epam.test.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupsPattern {
    public static void main(String[] args) {
//        example1();
        example2();
    }

    private static void example1() {
        String pattern = "First Name: (\\w+), Last Name: (\\w+)";
        String line = "First Name: John, Last Name: Doe\n" +
                "First Name: Jane, Last Name: Smith";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);

        while (m.find()) {
            System.out.println("Hi " + m.group(1) + " " + m.group(2));
        }
    }

    private static void example2() {
        String pattern = "First Name: (?<firstname>\\w+), Last Name: (?<lastname>\\w+)";
        String line = "First Name: John, Last Name: Doe\n" +
                "First Name: Jane, Last Name: Smith";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);

        while (m.find()) {
            System.out.println("Hi " + m.group("firstname") + " " + m.group("lastname"));
        }
    }
}
