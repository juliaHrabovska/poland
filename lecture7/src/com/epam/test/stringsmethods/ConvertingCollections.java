package com.epam.test.stringsmethods;

import java.util.List;

import static java.util.Arrays.asList;

public class ConvertingCollections {
    public static void main(String[] args) {
        List<String> people = asList(
                "Philip J. Fry",
                "Turanga Leela",
                "Bender Bending Rodriguez",
                "Hubert Farnsworth",
                "Hermes Conrad",
                "John D. Zoidberg",
                "Amy Wong"
        );

        String peopleString = String.join("; ", people);
        System.out.println(peopleString);

        // split
        String[] peopleArray = peopleString.split("; ");
        for (String human : peopleArray) {
            System.out.println(human);
        }
    }
}
