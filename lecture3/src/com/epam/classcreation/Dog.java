package com.epam.classcreation;

public class Dog {
    String name;
    int age;

    public void jump() {
        System.out.println("Jump!");
    }

    public void run() {
        System.out.println("Run!");
    }

//    public Dog() {
//
//    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Dog sam = new Dog("Sam", 3);
        sam.age = 3;
        sam.name = "Sam";

        System.out.println("We created a dog with name " + sam.name + ", his age - " + sam.age);

        sam.jump();
        sam.run();
    }

}
