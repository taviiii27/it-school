package com.session22_23;

public class MainForRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(80, 70);
        Rectangle r3 = new Rectangle(50, 10);

        System.out.println("r1 equals r2? → " + r1.equals(r2));
        System.out.println("r1 equals r3? → " + r1.equals(r3));
    }
}
