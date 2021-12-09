package com.epam.test.innerclass.anonymousclass;

public class SecurityModule implements MonitoringSystem {

    @Override
    public void startMonitoring() {
        System.out.println("Security monitoring has started");
    }
}

