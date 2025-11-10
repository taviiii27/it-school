package com.session21_LinkedList;


import java.util.LinkedList;

public class Append{
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        colors.addLast("Yellow");
        System.out.println("After appending element: " + colors);
    }
}

