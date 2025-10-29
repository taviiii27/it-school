package com.session21_ArrayList;
import java.util.ArrayList;

public class Trim {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(10);
        colors.add("Red");
        colors.add("Green");

        colors.trimToSize();
        System.out.println("Trimmed to current size: " + colors.size());
    }
}
