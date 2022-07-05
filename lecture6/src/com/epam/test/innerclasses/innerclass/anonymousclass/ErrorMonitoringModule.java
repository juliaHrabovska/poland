package com.epam.test.innerclasses.innerclass.anonymousclass;

public class ErrorMonitoringModule implements MonitoringSystem {

    @Override
    public void startMonitoring() {
        System.out.println("Error monitoring has started");
    }
}

