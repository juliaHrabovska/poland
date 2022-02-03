package com.test.other;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import static com.test.other.MethodReferenceExample.Car.collide;

public class MethodReferenceExample {
    public static class Car {
        public static Car create(Supplier<Car> supplier) {
            return supplier.get();
        }

        public static void collide(Car car) {
            System.out.println("Collided " + car.toString());
        }

        public void follow(Car another) {
            System.out.println("Following the " + another.toString());
        }

        public void repair() {
            System.out.println("Repaired " + this);
        }
    }

    public static void main(String[] args) {
        Car car = Car.create(Car::new); // reference to a constructor
//        Car car = Car.create(() -> new Car());

        List<Car> cars = Arrays.asList(car);

        cars.forEach(Car::collide); // reference to a static method
//        cars.forEach(c -> collide(c));
        cars.forEach(Car::repair); // reference to an instance method of an object of the certain type
//        cars.forEach(c -> c.repair());

        Car police = Car.create(Car::new);
        cars.forEach(police::follow); // reference to an instance method of a certain class
//        cars.forEach(c -> police.follow(c));
    }
}
