package com.session15_16;

public class TestAnimal {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal wolf = new Wolf();

        dog.sound();
        cat.sound();
        wolf.sound();
    }
}

