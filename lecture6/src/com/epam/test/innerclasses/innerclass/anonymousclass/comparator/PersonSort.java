package com.epam.test.innerclasses.innerclass.anonymousclass.comparator;

import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.asList;

public class PersonSort {
    public static void main(String[] args) {
        List<Person> persons = asList(
                new Person("Ivan", 25),
                new Person("Daria", 20)
        );

//        persons.sort(new PersonAgeComparator());
//        System.out.println(persons);
        persons.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
    }

    static class PersonAgeComparator implements Comparator<Person> {
        public int compare(Person a, Person b) {
            if (a.getAge() > b.getAge()) {
                return 1;
            } else if (a.getAge() < b.getAge()) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
