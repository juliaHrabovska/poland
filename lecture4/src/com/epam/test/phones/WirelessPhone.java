package com.epam.test.phones;

public abstract class WirelessPhone extends AbstractPhone {
    protected int hoursToWork;

    public WirelessPhone(int year, int hoursToWork) {
        super(year);
        this.hoursToWork = hoursToWork;
    }

    public int getHoursToWork() {
        return hoursToWork;
    }

    public void setHoursToWork(int hoursToWork) {
        if (hoursToWork < 15) {
            throw new IllegalArgumentException("Working hours can not be less then 15 minutes");
        }
        this.hoursToWork = hoursToWork;
    }
}
