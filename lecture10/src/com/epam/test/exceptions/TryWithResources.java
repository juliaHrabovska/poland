package com.epam.test.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public String input1() throws Exception {
        String s = null;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            s = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        if (s.equals("")){
            throw new Exception ("String can not be empty!");
        }
        return s;
    }

    public String input2() {
        String s = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            s = reader.readLine();
            if (s.equals("")) {
                throw new NullPointerException("String can not be empty!");
            }
        } catch (IOException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return s;
    }
}
