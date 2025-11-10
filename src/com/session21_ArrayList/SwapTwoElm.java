package com.session21_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElm {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        Collections.swap(colors, 0, 2);
        System.out.println("After swapping: " + colors);
    }
}

