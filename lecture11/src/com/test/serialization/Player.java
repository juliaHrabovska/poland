package com.test.serialization;

import java.io.Serializable;

public class Player implements Serializable {
    private transient int age;
    private String name;
    private transient String secondName;

    public Player(int age, String name, String secondName) {
        this.age = age;
        this.name = name;
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "age" + age + '\'' +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
