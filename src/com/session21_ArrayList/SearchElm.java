package com.session21_ArrayList;

import java.util.ArrayList;

public class SearchElm{
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        String search = "Green";
        if (colors.contains(search)) {
            System.out.println(search + " is found in the list.");
        } else {
            System.out.println(search + " is not in the list.");
        }
    }
}

