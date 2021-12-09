package com.epam.test.interfacetest;

import com.epam.test.interfacetest.messenger.Messenger;
import com.epam.test.interfacetest.messenger.Telegram;
import com.epam.test.interfacetest.messenger.Viber;
import com.epam.test.interfacetest.messenger.WhatsApp;

public class Client {
//    private WhatsApp whatsApp;
//    private Telegram telegram;
//    private Viber viber;

    private Messenger messenger;

    public Client() {
        this.messenger = new Telegram();
    }
}
