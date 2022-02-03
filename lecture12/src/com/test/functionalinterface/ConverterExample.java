package com.test.functionalinterface;

public class ConverterExample {
    public static class Dog {
        String name;
        int age;
        int weight;

        public Dog(final String name, final int age, final int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }

    public static class Raccoon {
        String name;
        int age;
        int weight;

        public Raccoon(final String name, final int age, final int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Bobbie", 5, 3);

        Converter<Dog, Raccoon> converter = (x) -> {
            return new Raccoon(x.name, x.age, x.weight);
        };

        Raccoon raccoon = converter.convert(dog);

        System.out.println("Raccoon has parameters: name - " + raccoon.name + ", age - " + raccoon.age + ", weight - " + raccoon.weight);
    }
}
