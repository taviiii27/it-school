package com.session21_LinkedList;

import java.util.LinkedList;
import java.util.Iterator;

public class IterateInReverse {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        Iterator<String> descIterator = colors.descendingIterator();
        while (descIterator.hasNext()) {
            System.out.println(descIterator.next());
        }
    }
}
