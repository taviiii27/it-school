package com.pack.session10;

import java.time.LocalDate;

public class TodaysDate {
    public static void displayTodaysDate() {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);
    }

    public static void main(String[] args) {
        displayTodaysDate();
    }
}
