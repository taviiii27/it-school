package com.session21_ArrayList;

import java.util.ArrayList;

public class EmptyArrayL {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");

        colors.clear();
        System.out.println("List after emptying: " + colors);
    }
}
