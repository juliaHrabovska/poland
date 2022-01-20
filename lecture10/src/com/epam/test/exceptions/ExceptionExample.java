package com.epam.test.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionExample {
    //the method reads an information from a console
    public String input() throws Exception {//warning with throws, that the method can throw Exception
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
//        in the try block we enclose the code in which an exception can occur,
//        in this case the compiler tells us that the readLine () method of the BufferedReader class
//        can throw an I/O exception
        try {
            s = reader.readLine();
//        in the catch block we enclose the code for handling the IOException exception
        } catch (IOException e) {
            System.out.println(e.getMessage());
//        close the read stream in the finally block
        } finally {
//        when closing the stream, an exception is also possible,
//        for example, if it was not opened, so we “wrap” the code in a try block
            try {
                reader.close();
//        writing an exception handling when the read stream is closed
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        if (s.equals("")) {
//        if we decided that an empty string could disrupt the operation of our program in the future,
//        for example, on the result of this method, we need to call the substring(1,2) method,
//        so we are forced to interrupt the program execution with the generation of our exception type Exception using throw
            throw new Exception("String can not be empty!");
        }
        return s;
    }

    public static void main(String[] args) {

    }
}
