package com.session21_LinkedList;

import java.util.LinkedList;
import java.util.Collections;

public class SwapTwo {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        Collections.swap(colors, 0, 2);
        System.out.println("After swapping: " + colors);
    }
}
