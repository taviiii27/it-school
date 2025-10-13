package com.pack.session10;

import java.time.LocalDate;

public class DateDecomposition {
    public static void displayDateComponents(String dateStr) {
        LocalDate date = LocalDate.parse(dateStr);
        System.out.println("Year: " + date.getYear());
        System.out.println("Month: " + date.getMonthValue());
        System.out.println("Day: " + date.getDayOfMonth());
    }

    public static void main(String[] args) {
        displayDateComponents("2025-09-19");
    }
}

