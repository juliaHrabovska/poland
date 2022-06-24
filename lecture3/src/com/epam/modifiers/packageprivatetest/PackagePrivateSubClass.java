package com.epam.modifiers.packageprivatetest;

public class PackagePrivateSubClass extends PackagePrivateModifier {
    public void test1() {
        packagePrivateTest();
        packagePrivateVariable = 0;
    }
}
