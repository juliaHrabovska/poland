package com.epam.test.history;

import java.util.ArrayList;
import java.util.List;

public class ListClass {

    private Object[] data;
    private int count;

    public ListClass() {
        this.data = new Object[10];
        this.count = 0;
    }

    public void add(Object o) {
        this.data[count] = o;
        count++;
    }

    public Object[] getData() {
        return data;
    }

    public static void main(String[] args) {
        ListClass list = new ListClass();
        list.add(100);
        list.add(200);
        list.add("test1");
        list.add("test2");

        Integer sum1 = (Integer) list.getData()[0] + (Integer) list.getData()[1];
        System.out.println(sum1);

        Integer sum2 = (Integer) list.getData()[2] + (Integer) list.getData()[3];
        System.out.println(sum2);

        List integers = new ArrayList();
        integers.add(100);
        integers.add(200);
//        integers.add("test1");
//        integers.add("test2");
    }
}