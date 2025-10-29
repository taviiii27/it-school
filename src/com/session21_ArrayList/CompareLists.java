package com.session21_ArrayList;

import java.util.ArrayList;

public class CompareLists{
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Red");
        list2.add("Green");
        list2.add("Yellow");

        for (String color : list1) {
            System.out.println(color + ": " + (list2.contains(color) ? "Present" : "Not present"));
        }
    }
}
