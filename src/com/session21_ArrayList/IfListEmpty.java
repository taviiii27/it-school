package com.session21_ArrayList;

import java.util.ArrayList;

public class IfListEmpty {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        System.out.println("Is the list empty? " + colors.isEmpty());
        colors.add("Red");
        System.out.println("Is the list empty now? " + colors.isEmpty());
    }
}
