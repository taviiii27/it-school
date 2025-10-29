package com.session21_ArrayList;

import java.util.ArrayList;

public class CloneArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        ArrayList<String> cloned = (ArrayList<String>) colors.clone();
        System.out.println("Cloned list: " + cloned);
    }
}

