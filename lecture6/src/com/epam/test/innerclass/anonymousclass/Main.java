package com.epam.test.innerclass.anonymousclass;

public class Main {

//    public static void main(String[] args) {
//        GeneralIndicatorsMonitoringModule generalModule = new GeneralIndicatorsMonitoringModule();
//        ErrorMonitoringModule errorModule = new ErrorMonitoringModule();
//        SecurityModule securityModule = new SecurityModule();
//
//        generalModule.startMonitoring();
//        errorModule.startMonitoring();
//        securityModule.startMonitoring();
//    }

    public static void main(String[] args) {
        MonitoringSystem generalModule =
                () -> System.out.println("General indicator monitoring has started");

        MonitoringSystem errorModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Error monitoring has started");
            }
        };

        MonitoringSystem securityModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Security monitoring has started");
            }
        };

        generalModule.startMonitoring();
        errorModule.startMonitoring();
        securityModule.startMonitoring();
    }
}
