package com.test.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    public static void main(String[] args) {
        // Creating a Path object using a method get() of Paths class
        Path testFilePath = Paths.get("src/com/test/nio_test.txt");

        // for Windows
        //Path testFilePath = Paths.get("D:\\test\\testfile.txt");

        // Print information about a file
        System.out.println("Printing file information: ");
        System.out.println("\t file name: " + testFilePath.getFileName());
        System.out.println("\t root of the path: " + testFilePath.getRoot());
        System.out.println("\t parent of the target: " + testFilePath.getParent());

        // Print elements of the path
        System.out.println("Printing elements of the path: ");
        for (Path element : testFilePath) {
            System.out.println("\t path element: " + element);
        }
    }
}
