package com.epam.test.enums;

public class MonthBeforeJava5 {
    private String name;
    private int daysCount;

    private MonthBeforeJava5(String name, int daysCount) {
        this.name = name;
        this.daysCount = daysCount;
    }

    public static MonthBeforeJava5 JANUARY = new MonthBeforeJava5("January", 31);
    public static MonthBeforeJava5 FEBRUARY = new MonthBeforeJava5("February", 28);
    public static MonthBeforeJava5 MARCH = new MonthBeforeJava5("Match", 31);

    @Override
    public String toString() {
        return "Month{" +
                "name='" + name + '\'' +
                ", daysCount=" + daysCount +
                '}';
    }
}
