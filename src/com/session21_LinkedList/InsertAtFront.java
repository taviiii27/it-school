package com.session21_LinkedList;
import java.util.LinkedList;

public class InsertAtFront{
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Green");
        colors.add("Blue");

        colors.offerFirst("Red");
        System.out.println("After inserting at front: " + colors);
    }
}

