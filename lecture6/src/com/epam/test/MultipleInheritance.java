package com.epam.test;

public class MultipleInheritance {
    abstract class Cat {

    }

    class Tiger extends Cat {

        public void tigerRun() {
            //  .....
        }

        public void startTiger() {
            TigerThread thread = new TigerThread();
            thread.start();
        }

        class TigerThread extends Thread {
            public void run() {
                tigerRun();
            }
        }
    }

}
