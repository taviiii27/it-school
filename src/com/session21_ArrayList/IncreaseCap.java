package com.session21_ArrayList;

import java.util.ArrayList;

public class IncreaseCap{
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.ensureCapacity(10);

        colors.add("Red");
        colors.add("Green");
        System.out.println("List after ensuring capacity: " + colors);
    }
}
