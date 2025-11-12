package com.session21_LinkedList;

import java.util.LinkedList;

public class FirstLastOccurence {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        int first = colors.indexOf("Blue");
        int last = colors.lastIndexOf("Blue");

        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }
}

