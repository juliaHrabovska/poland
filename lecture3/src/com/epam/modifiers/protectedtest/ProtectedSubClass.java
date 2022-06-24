package com.epam.modifiers.protectedtest;


public class ProtectedSubClass extends ProtectedModifier {
    public void test1() {
        protectedTest();
        protectedVariable = 0;
    }
}
