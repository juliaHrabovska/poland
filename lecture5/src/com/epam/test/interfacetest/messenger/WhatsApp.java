package com.epam.test.interfacetest.messenger;

public class WhatsApp implements Messenger {

    public void sendMessage() {
        System.out.println("Send a message in WhatsApp!");
    }

    public void getMessage() {
        System.out.println("Read a message in WhatsApp!");
    }
}

