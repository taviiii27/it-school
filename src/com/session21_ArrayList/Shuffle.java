package com.session21_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle{
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        Collections.shuffle(colors);
        System.out.println("Shuffled list: " + colors);
    }
}

