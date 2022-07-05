package com.epam.test.innerclasses.staticclass;

public class Boeing737 {
    private int manufactureYear;
    private static int maxPassengersCount = 300;

    public Boeing737(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public static class Drawing {
        private int id;

        public Drawing(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public static int getPassengersCount() {
            return maxPassengersCount;
        }

        @Override
        public String toString() {
            return "Drawing{" +
                    "id=" + id +
                    '}';
        }

        public static void main(String[] args) {
//            Bicycle mtb = new Bicycle("MTB", 120);
//            Bicycle.HandleBar handleBar = mtb.new HandleBar();
            for (int i = 1; i < 6; i++) {
                Drawing drawing = new Drawing(i);
                System.out.println(drawing);
            }
        }
    }
}
