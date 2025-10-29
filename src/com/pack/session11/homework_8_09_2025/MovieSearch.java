package com.pack.session11.homework_8_09_2025;

import java.util.Scanner;

public class MovieSearch {
    public static void main(String[] args) {
        String[] movies = {"Inception", "Titanic", "Avengers", "Matrix", "Interstellar"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter movie title to search: ");
        String target = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].equalsIgnoreCase(target)) {
                System.out.println(target + " found at position " + i);
                found = true;
                break;
            }
        }
        if (!found) System.out.println(target + " not found.");
    }
}
