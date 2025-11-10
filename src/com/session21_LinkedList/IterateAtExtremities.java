package com.session21_LinkedList;

import java.util.LinkedList;

public class IterateAtExtremities {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Green");

        colors.addFirst("Red");
        colors.addLast("Blue");

        System.out.println("Linked list: " + colors);
    }
}
