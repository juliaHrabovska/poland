package com.epam.test.stringsmethods;

public class BasicMethods {
    public static void main(String[] args) {
        // toLower toUpper
        String fry = "Philip J. Fry";

        String lowerCaseFry = fry.toLowerCase();
        String upperCaseFry = fry.toUpperCase();

        System.out.println(lowerCaseFry);
        System.out.println(upperCaseFry);

        // trim
        String str = "       Tabulated String         ";
        String tStr = str.trim();
        System.out.println(tStr);

        //
        String strReplace = "abracadabra";
        strReplace.replaceFirst("a", "o");
        String rStr = strReplace.replace('a', 'o');
        String rStr1 = strReplace.replaceAll("ab", "o");
        System.out.println(rStr);
        System.out.println(rStr1);

        // isEmpty
        System.out.println(rStr.isEmpty());
    }
}
