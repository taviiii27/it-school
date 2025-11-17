package com.session22_23;

public class MainForLightColor {
    public static void main(String[] args) {
        for (LightColor color : LightColor.values()) {
            System.out.println(color + " → " + color.getDescription() +
                    " (" + color.getDuration() + " seconds)");
        }
    }
}
