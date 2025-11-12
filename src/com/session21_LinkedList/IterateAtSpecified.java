package com.session21_LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class IterateAtSpecified {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        ListIterator<String> iterator = colors.listIterator(2); // start at index 2
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
