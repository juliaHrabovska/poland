package com.epam.modifiers;

import com.epam.modifiers.protectedtest.ProtectedModifier;

public class AnotherPackageProtectedSubClass extends ProtectedModifier {
    public void test() {
        protectedVariable = 0;
        protectedTest();
    }
}
