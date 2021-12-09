package com.epam.test.innerclass.anonymousclass;

public class GeneralIndicatorsMonitoringModule implements MonitoringSystem {

    @Override
    public void startMonitoring() {
        System.out.println("General indicator monitoring has started");
    }
}
