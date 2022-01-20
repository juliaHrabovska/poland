package com.epam.test.streams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        bufferedReaderExample();
        systemInExample();
        inputStreamReaderExample();
        readFromUriExample();
        readFromFileExample();
    }

    private static void bufferedReaderExample() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String x = reader.readLine();
        System.out.println(x);
    }

    private static void systemInExample() throws IOException {
        while (true) {
            int x = System.in.read();
            System.out.println(x);
        }
    }

    private static void inputStreamReaderExample() {
        try (InputStreamReader reader = new InputStreamReader(System.in);) {
            while (true) {
                int x = reader.read();
                System.out.println(x);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFromUriExample() throws MalformedURLException {
        URL oracle = new URL("https://www.oracle.com/index.html");
        try (BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()))) {
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFromFileExample() {
        try (FileInputStream fileInputStream = new FileInputStream("src/com/epam/test/testFile.txt");
             BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));) {
            String str;

            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
