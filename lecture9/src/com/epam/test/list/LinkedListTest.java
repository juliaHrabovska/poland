package com.epam.test.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
//        createLinkedList();
        addFirstLast();
        peekFirstLast();
        pollFirstLast();
    }

    private static void createLinkedList() {
        String str1 = "Hello World!";
        String str2 = "Test";
        String str3 = "LinkedList";

        List<String> testLinkedList = new LinkedList<>();
        testLinkedList.add(str1);
        testLinkedList.add(str3);
        testLinkedList.add(1, str2);

        System.out.println(testLinkedList);
    }

    static class Car {

        String model;

        public Car(String model) {
            this.model = model;
        }
        @Override
        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    '}';
        }


    }

    private static void addFirstLast() {
        LinkedList<Car> cars = new LinkedList<>();
        Car ferrari = new Car("Ferrari 360 Spider");
        Car bugatti = new Car("Bugatti Veyron");
        Car lambo = new Car("Lamborghini Diablo");
        Car ford = new Car("Ford Mondeo");
        Car fiat = new Car("Fiat Ducato");

        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(lambo);
        System.out.println(cars);

        cars.addFirst(ford);
        cars.addLast(fiat);
        System.out.println(cars);
    }

    private static void peekFirstLast() {
        LinkedList<Car> cars = new LinkedList<>();
        Car ferrari = new Car("Ferrari 360 Spider");
        Car bugatti = new Car("Bugatti Veyron");
        Car lambo = new Car("Lamborghini Diablo");

        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(lambo);
        System.out.println(cars.peekFirst());
        System.out.println(cars.peekLast());
    }

    private static void pollFirstLast() {
        LinkedList<Car> cars = new LinkedList<>();
        Car ferrari = new Car("Ferrari 360 Spider");
        Car bugatti = new Car("Bugatti Veyron");
        Car lambo = new Car("Lamborghini Diablo");

        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(lambo);
        System.out.println(cars.pollFirst());
        System.out.println(cars.pollLast());

        System.out.println("What's left on the list?");
        System.out.println(cars);
    }
}
