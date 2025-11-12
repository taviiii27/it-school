package com.session21_LinkedList;

import java.util.LinkedList;

public class RemoveAll{
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");

        colors.clear();
        System.out.println("After clearing: " + colors);
    }
}

