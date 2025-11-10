package com.session21_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ExtractPortion {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        List<String> subList = colors.subList(1, 4);
        System.out.println("Extracted portion: " + subList);
    }
}
