package com.epam.test.interfacetest;

import com.epam.test.interfacetest.messenger.Telegram;

public class Smartphone {
    private Application application;

    public Smartphone() {
        this.application = new Telegram();
    }
}
