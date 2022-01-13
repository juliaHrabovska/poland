package com.epam.test.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {
//        hashCodeAndEqualsExample();
//        treeSetExample();
        hashSetExample();
    }

    private static void hashCodeAndEqualsExample() {
        class Person {
            private String name;
            private int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public boolean equals(Object o) {
                return false;
//                if (this == o) return true;
//                if (!(o instanceof Person)) return false;
//                Person pearson = (Person) o;
//                return age == pearson.age && Objects.equals(name, pearson.name);
            }

            @Override
            public int hashCode() {
                return 1;
//                return Objects.hash(name, age);
            }

            @Override
            public String toString() {
                return "Person{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }
        Set<Person> personsSet = new HashSet<>();
        personsSet.add(new Person("Ivan", 25));
        personsSet.add(new Person("Olha", 35));

        System.out.println(personsSet);
        personsSet.add(new Person("Olha", 35));
        System.out.println(personsSet);
    }

    private static void treeSetExample() {
        TreeSet<String> animalSet = new TreeSet<>();
        animalSet.add("Antilope");
        animalSet.add("Fox");
        animalSet.add("Goat");
        animalSet.add("Dog");
        animalSet.add("Elephant");
        animalSet.add("Bear");
        animalSet.add("Hippo");
        animalSet.add("Cat");

        System.out.println(animalSet);
        System.out.println(animalSet.subSet("Dog", "Hippo"));
        System.out.println(animalSet.tailSet("Dog"));
        System.out.println(animalSet.headSet("Dog"));
        System.out.println(animalSet.first());
        System.out.println(animalSet.last());
    }

    private static void hashSetExample() {
        Set<String> animalSet = new HashSet<>();
        animalSet.add("Antilope");
        animalSet.add("Fox");
        animalSet.add("Goat");
        animalSet.add("Dog");
        animalSet.add("Elephant");
        animalSet.add("Bear");
        animalSet.add("Hippo");
        animalSet.add("Cat");

        System.out.println(animalSet);
    }
}
