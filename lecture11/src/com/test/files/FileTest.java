package com.test.files;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("src/com/test/test_serialization.txt");
        String directory = file.getParent();
    }
}
