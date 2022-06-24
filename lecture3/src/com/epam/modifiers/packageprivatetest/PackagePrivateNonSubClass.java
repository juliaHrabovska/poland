package com.epam.modifiers.packageprivatetest;

public class PackagePrivateNonSubClass {
    public void test2() {
        PackagePrivateModifier packagePrivateModifier = new PackagePrivateModifier();
        packagePrivateModifier.packagePrivateTest();
        packagePrivateModifier.packagePrivateVariable = 0;
    }
}
