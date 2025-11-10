package com.session21_LinkedList;

import java.util.LinkedList;

public class InsertAtEnd{
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");

        colors.offerLast("Blue");
        System.out.println("After inserting at end: " + colors);
    }
}
