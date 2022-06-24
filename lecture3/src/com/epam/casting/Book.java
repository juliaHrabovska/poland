package com.epam.casting;

public class Book extends ShoppingItem implements Printable {
    public void description() {
        System.out.println("Book");
    }

    public void print() {
        System.out.println("Printing book");
    }
}
