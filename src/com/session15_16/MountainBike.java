package session15_16;

public class MountainBike extends Bicycle {
    String tireType;
    String suspension;


    public MountainBike(int speed, int gear, String tireType, String suspension) {
        super(speed, gear);
        this.tireType = tireType;
        this.suspension = suspension;
    }


    public void adjustSuspension(String newSuspension) {
        suspension = newSuspension;
        System.out.println("Suspension adjusted to: " + suspension);
    }
}

