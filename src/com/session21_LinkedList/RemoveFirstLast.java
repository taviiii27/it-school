package com.session21_LinkedList;

import java.util.LinkedList;

public class RemoveFirstLast {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        colors.removeFirst();
        colors.removeLast();

        System.out.println("After removing first and last: " + colors);
    }
}

