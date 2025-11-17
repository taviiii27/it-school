package com.session22_23;

public class MainForPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Alex", 25, "alex@mail.com");
        Person p2 = new Person("Andrei", 25, "andrei7@mail.com");
        Person p3 = new Person("Matteo", 30, "matteo459@mail.com");

        System.out.println("does p1 equal p2? → " + p1.equals(p2));
        System.out.println("does p1 equal p3? → " + p1.equals(p3));
    }
}
