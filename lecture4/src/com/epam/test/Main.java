package com.epam.test;

import com.epam.test.phones.ButtonPhone;
import com.epam.test.phones.CellPhone;
import com.epam.test.phones.Smartphone;

public class Main {

    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone(2021, 200);
        cellPhone.getHoursToWork();
        cellPhone.setHoursToWork(300);

        ButtonPhone buttonPhone = new ButtonPhone(2000);
        Smartphone smartphone = new Smartphone(2021, 200);

        cellPhone.call("+1234567");
        cellPhone.ring("+1234567");

        buttonPhone.call("+1234567");
        buttonPhone.ring("+1234567");

        smartphone.call("+1234567");
        smartphone.ring("+1234567");
        smartphone.install("Android");
        Integer
    }
}
