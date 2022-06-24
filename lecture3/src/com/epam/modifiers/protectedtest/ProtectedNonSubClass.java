package com.epam.modifiers.protectedtest;


public class ProtectedNonSubClass {
    public void test2() {
        ProtectedModifier protectedModifier = new ProtectedModifier();
        protectedModifier.protectedTest();
        protectedModifier.protectedVariable = 0;
    }
}
