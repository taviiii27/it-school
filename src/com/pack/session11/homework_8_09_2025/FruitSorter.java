package com.pack.session11.homework_8_09_2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FruitSorter {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Watermelon");
        fruits.add("Orange");

        Collections.sort(fruits, new Comparator<String>() {
            @Override
            public int compare(String f1, String f2) {
                if (f1.length() != f2.length()) return f2.length() - f1.length();
                return f1.compareTo(f2);
            }
        });

        System.out.println("Sorted fruits:");
        for (String f : fruits) System.out.println(f);
    }
}
