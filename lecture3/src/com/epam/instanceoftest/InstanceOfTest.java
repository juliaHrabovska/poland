package com.epam.instanceoftest;

public class InstanceOfTest {
    public static void main(String[] args) {
        HeavyAnimal hippo = new Hippo();

        System.out.println("hippo instanceof Hippo " + (hippo instanceof Hippo));
        System.out.println("hippo instanceof HeavyAnimal " + (hippo instanceof HeavyAnimal));
        System.out.println("hippo instanceof Elephant " + (hippo instanceof Elephant));
        System.out.println("hippo instanceof Object " + (hippo instanceof Object));
        Hippo nullHippo = null;
        System.out.println("nullHippo instanceof Object " + (nullHippo instanceof Object));

    }
}
