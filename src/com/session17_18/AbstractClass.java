package com.session17_18;

abstract class AbstractClass {
    public AbstractClass() {
        System.out.println("This is constructor of abstract class");
    }

    abstract void aMethod();

    void normalMethod() {
        System.out.println("This is a normal method of abstract class");
    }
}

class SubClass extends AbstractClass {
    @Override
    void aMethod() {
        System.out.println("This is abstract method");
    }
}

class TestAbstractClass {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.aMethod();
        obj.normalMethod();
    }
}
