package com.access.one;

public class Base {
    public void publicMethod() {
        System.out.println("Public Method - Accessible everywhere");
    }
    
    protected void protectedMethod() {
        System.out.println("Protected Method - Accessible in same package and subclasses");
    }
    
    void defaultMethod() {
        System.out.println("Default Method - Accessible only in same package");
    }
    
    private void privateMethod() {
        System.out.println("Private Method - Accessible only within same class");
    }
    
    public void showAccess() {
        System.out.println("--- Access from Same Class (Base) ---");
        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }
}

