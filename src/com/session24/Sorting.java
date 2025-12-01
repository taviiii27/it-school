package com.session24;

import java.util.Arrays;
import java.util.List;

public class Sorting{
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "cherry", "date");

        // Alphabetical
        words.sort((a, b) -> a.compareTo(b));
        System.out.println("Alphabetical: " + words);

        // Reverse alphabetical
        words.sort((a, b) -> b.compareTo(a));
        System.out.println("Reverse alphabetical: " + words);
    }

}

