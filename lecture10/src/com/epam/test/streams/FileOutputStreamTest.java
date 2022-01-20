package com.epam.test.streams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        File file = new File("src/com/epam/test/test1.txt");

//        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) { // to replace the information in the file
        try (FileOutputStream fileOutputStream = new FileOutputStream(file, true)) { // to add information to the file
            String text = "Some text!123";

            fileOutputStream.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
