package com.epam.test.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
//        String numberPattern = "\+4\(\d{3}\)\d{3}-\d{2}-\d{2}";
//        String numberPattern = "\\+4\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}";
//        String number = "+4(850)353-31-15" +
//               "+4(850)123-36-65" +
//                "+4(850)523-81-35" +
//                "+4(850)987-88-95";
//
//        Pattern pattern = Pattern.compile(numberPattern);
//        Matcher matcher = pattern.matcher(number);
//
//        System.out.println(matcher.find());

        String pattern = "[a-z]+";
        String text = "Now is the time";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.print(text.substring(m.start(), m.end()) + "*");
        }

    }
}
