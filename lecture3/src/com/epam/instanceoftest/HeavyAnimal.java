package com.epam.instanceoftest;

import java.util.Objects;

public class HeavyAnimal {
    public String name;
    public int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HeavyAnimal)) return false;
        HeavyAnimal that = (HeavyAnimal) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "HeavyAnimal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}