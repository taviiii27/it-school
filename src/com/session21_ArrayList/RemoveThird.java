package com.session21_ArrayList;

import java.util.ArrayList;

public class RemoveThird {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        colors.remove(2);
        System.out.println("After removing third element: " + colors);
    }
}
