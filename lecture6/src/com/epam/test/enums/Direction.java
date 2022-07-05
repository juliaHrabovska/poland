package com.epam.test.enums;

public enum Direction {
    UP {
        @Override
        public Direction opposite() {
            return DOWN;
        }
    },
    DOWN {
        @Override
        public Direction opposite() {
            return UP;
        }
    };
    public abstract Direction opposite();
//    public Direction opposite(){
//        return this == UP ? DOWN : UP;
//    };
}
