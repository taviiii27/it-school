package com.session21_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList{
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Blue");

        Collections.sort(colors);
        System.out.println("Sorted list: " + colors);
    }
}
