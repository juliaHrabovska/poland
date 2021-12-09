package com.epam.test.difference;

public abstract class Bird implements Flyable {
    private String species;
    private int age;

    public abstract void fly();

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
