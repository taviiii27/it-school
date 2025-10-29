package com.pack.session10;

import java.time.LocalDate;

public class WeekdayIdentifier {
    public static String findDayOfWeek(String dateStr) {
        LocalDate date = LocalDate.parse(dateStr);
        return date.getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        System.out.println("Day of week: " + findDayOfWeek("2025-08-19"));
    }
}
