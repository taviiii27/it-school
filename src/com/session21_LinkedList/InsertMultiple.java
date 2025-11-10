package com.session21_LinkedList;

import java.util.LinkedList;

public class InsertMultiple {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");

        LinkedList<String> newColors = new LinkedList<>();
        newColors.add("Green");
        newColors.add("Yellow");

        colors.addAll(1, newColors);
        System.out.println("After insertion: " + colors);
    }
}
