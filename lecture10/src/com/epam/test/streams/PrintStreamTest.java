package com.epam.test.streams;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream filePrintStream = new PrintStream("src/com/epam/test/test2.txt");

        PrintStream console = System.out;

        System.setOut(filePrintStream);
        System.out.println("This line is written in the file");

        System.setOut(console);
        System.out.println("This line is written in a console");
    }
}
