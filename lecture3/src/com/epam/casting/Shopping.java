package com.epam.casting;

class Shopping {
    public static void main(String[] args) {
        Book book = new Book();
        book.description();
        ShoppingItem shoppingItem = book; // Implicit casting
        ShoppingItem shoppingItem1 = new Book(); // Implicit casting
        shoppingItem.description();

        Printable printable = book; // Implicit casting
        printable.print();

        Printable printable1 = new Book();
        ((Book) printable1).description(); // Explicit casting

        // ----------------------------------------------------
        Object object = book;
        Object object1 = shoppingItem;

//        ShoppingItem item = new ShoppingItem();
//        Printable printable6 = item;

//        Printable printable = new Book();
//        printable.description();

//        Chair chair = new Chair();
//        Printable printable7 = chair;

//        Book book = new Book();
//        Chair chair = book;

//        Book item = new Book();
//        Book book7 = (Book) item;
//        Chair chair = new Chair();
//        Chair chair = item;
    }
}

