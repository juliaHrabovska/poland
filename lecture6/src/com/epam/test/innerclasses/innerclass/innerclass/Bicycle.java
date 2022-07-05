package com.epam.test.innerclasses.innerclass.innerclass;

public class Bicycle {
    private String model;
    private int weight;
    private int seatPostDiameter;

    public Bicycle(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }

    public void start() {
        System.out.println("Go");
    }

    public class HandleBar {
        public void right() {
            System.out.println("Turn right");
        }

        public void left() {
            System.out.println("Turn left");
        }
    }

    public class Seat {
        public void up() {
            System.out.println("The seat raised higher");
        }

        public void down() {
            System.out.println("The seat is lowered below");
        }

        public void getSeatParam() {
            System.out.println("Seat post diameter = " + Bicycle.this.seatPostDiameter);
        }

//        public static void getSeatParam() {
//            System.out.println("Seat post diameter = " + Bicycle.this.seatPostDiameter);
//        }
    }

//    public static Seat createSeat() {
//        Bicycle.this cannot be referenced from a static context
//        return new Seat();
//    }
}
