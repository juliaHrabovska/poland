package com.epam.test.wildcards.hierarhy;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        example1();
        example2();
        example3();
    }

    private static void example1() {
        String s = "1245";
        int i = Integer.parseInt(s);
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

//        Compilation error
//        iterateAnimals1(cats);
    }

    public static void iterateAnimals1(List<Animal> animals) {
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
    }

    private static void example2() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());

        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet());
        pets.add(new Pet());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        iterateAnimals2(animals);
        iterateAnimals2(pets);
        iterateAnimals2(cats);
        iterateAnimals2(dogs);
    }

    public static void iterateAnimals2(List<? extends Animal> animals) {
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
    }

    private static void example3() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());

        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet());
        pets.add(new Pet());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        iterateAnimals3(animals);
        iterateAnimals3(pets);
        iterateAnimals3(cats);

//        Compilation error
//        iterateAnimals3(dogs);
    }

    public static void iterateAnimals3(List<? super Cat> animals) {
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
    }
}
