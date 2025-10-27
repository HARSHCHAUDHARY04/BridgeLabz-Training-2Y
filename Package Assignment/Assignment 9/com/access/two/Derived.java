package com.access.two;

import com.access.one.Base;

public class Derived extends Base {
    public void testAccess() {
        System.out.println("--- Access from Subclass (Derived in different package) ---");
        publicMethod();
        protectedMethod();
    }
}

