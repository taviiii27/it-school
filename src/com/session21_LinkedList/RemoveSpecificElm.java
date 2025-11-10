package com.session21_LinkedList;

import java.util.LinkedList;

public class RemoveSpecificElm {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        colors.remove("Green");
        System.out.println("After removing element: " + colors);
    }
}
