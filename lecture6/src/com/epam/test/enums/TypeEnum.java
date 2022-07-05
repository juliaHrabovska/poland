package com.epam.test.enums;

public enum TypeEnum {
    INT(true) {
        @Override
        public Object parse(String string) {
            return Integer.valueOf(string);
        }
    },
    INTEGER(false){
        @Override
        public Object parse(String string) {
            return Integer.valueOf(string);
        }
    },
    STRING(false){
        @Override
        public Object parse(String string) {
            return string;
        }
    };

    private boolean isPrimitive;
    TypeEnum(boolean isPrimitive) {
        this.isPrimitive = isPrimitive;
    }

    public boolean isPrimitive() {
        return isPrimitive;
    }

    public abstract Object parse(String string);
}
