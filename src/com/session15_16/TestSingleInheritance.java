package com.session15_16;

public class TestSingleInheritance {
    public static void main(String[] args) {

        Bicycle bike = new Bicycle(10, 2);
        bike.speedUp(5);
        bike.changeGear(3);
        bike.applyBrake(4);

        System.out.println();

        MountainBike mountainBike = new MountainBike(15, 4, "Knobby", "Hard");
        mountainBike.speedUp(10);
        mountainBike.changeGear(5);
        mountainBike.applyBrake(6);
        mountainBike.adjustSuspension("Soft");
    }
}
