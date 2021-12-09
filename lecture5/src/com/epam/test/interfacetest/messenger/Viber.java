package com.epam.test.interfacetest.messenger;

public class Viber implements Messenger {

    public void sendMessage() {
        System.out.println("Send a message in Viber!");
    }

    public void getMessage() {
        System.out.println("Read a message in Viber!");
    }
}

