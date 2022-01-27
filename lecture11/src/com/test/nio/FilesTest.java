package com.test.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesTest {
    public static void main(String[] args) {
        // Creating a Path object using a method get() of Paths class
        Path path = Paths.get("src/com/test/testdirectory/movedfile.txt");
//        Path path = Paths.get("src/com/test/"); // directory
//        Path path = Paths.get("src/com/test/nio_test1.txt"); // not existed file

        // for Windows
        //Path testFilePath = Paths.get("D:\\test\\testfile.txt");

        getGeneralInfoAboutFile(path);
//        copyFiles(path);
//        movingFile(path);
//        deleteFile(path);
    }

    private static void getGeneralInfoAboutFile(Path path) {
        if (Files.exists(path, LinkOption.NOFOLLOW_LINKS)) {
            System.out.println("The file/directory " + path.getFileName() + " exists");
            if (Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS)) {
                System.out.println(path.getFileName() + " is a directory");
            } else {
                System.out.println(path.getFileName() + " is a file");
            }
        } else {
            System.out.println("The file/directory " + path.getFileName() + " does not exist");
        }

        System.out.printf("Readable: %b, Writable: %b, Executable: %b ",
                Files.isReadable(path), Files.isWritable(path), Files.isExecutable(path));

        try {
            Object object = Files.getAttribute(path, "creationTime");
            System.out.println("Creation time: " + object);

            object = Files.getAttribute(path, "lastModifiedTime",
                    LinkOption.NOFOLLOW_LINKS);
            System.out.println("Last modified time: " + object);

            object = Files.getAttribute(path, "size");
            System.out.println("Size: " + object);

            object = Files.getAttribute(path, "isDirectory");
            System.out.println("isDirectory: " + object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copyFiles(Path pathSource) {
        Path pathDestination = Paths.get("src/com/test/testdirectory/nio_test.txt");
        try {
            Files.copy(pathSource, pathDestination);
            System.out.println("Source file copied successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void movingFile(Path pathSource) {
        Path pathDestination = Paths.get("src/com/test/testdirectory/movedfile.txt");
        try {
            Files.move(pathSource, pathDestination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Source file copied successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deleteFile(Path pathSource) {
        try {
            Files.delete(pathSource);
            System.out.println("File deleted successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
