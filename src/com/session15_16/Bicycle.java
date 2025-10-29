package com.session15_16;

public class Bicycle {
    int speed;
    int gear;

    // Constructor
    public Bicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    // Methods
    public void changeGear(int newGear) {
        gear = newGear;
        System.out.println("Gear changed to: " + gear);
    }

    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Speed increased to: " + speed);
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
        if (speed < 0) speed = 0;
        System.out.println("Speed decreased to: " + speed);
    }
}
