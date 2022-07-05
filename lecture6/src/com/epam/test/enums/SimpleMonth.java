package com.epam.test.enums;

import java.util.Objects;

public class SimpleMonth {

    private String name;
    private int daysCount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimpleMonth)) return false;
        SimpleMonth that = (SimpleMonth) o;
        return daysCount == that.daysCount && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, daysCount);
    }

    public SimpleMonth(String name, int daysCount) {
        this.name = name;
        this.daysCount = daysCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDaysCount() {
        return daysCount;
    }

    public void setDaysCount(int daysCount) {
        this.daysCount = daysCount;
    }

    @Override
    public String toString() {
        return "Month{" +
                "name='" + name + '\'' +
                ", daysCount=" + daysCount +
                '}';
    }
}

