package com.epam.test.exceptions;

public class MyException extends RuntimeException /*Exception*/ {
    public MyException() {
    }
    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
}
