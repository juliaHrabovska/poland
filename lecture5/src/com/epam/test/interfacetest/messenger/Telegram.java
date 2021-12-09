package com.epam.test.interfacetest.messenger;

import com.epam.test.interfacetest.Application;

public class Telegram implements Messenger, Application {

    public void sendMessage() {
        System.out.println("Send a message in Telegram!");
    }

    public void getMessage() {
        System.out.println("Read a message in Telegram!");
    }
}

