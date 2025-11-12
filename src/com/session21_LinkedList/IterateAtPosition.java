package com.session21_LinkedList;

import java.util.LinkedList;

public class IterateAtPosition {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");

        colors.add(1, "Green");
        System.out.println("After insertion: " + colors);
    }
}
