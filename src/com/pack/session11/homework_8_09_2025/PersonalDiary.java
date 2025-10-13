package com.pack.session11.homework_8_09_2025;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class DiaryEntry {
    String date;
    String entry;

    DiaryEntry(String date, String entry) {
        this.date = date;
        this.entry = entry;
    }
}

public class PersonalDiary {
    private static ArrayList<DiaryEntry> diary = new ArrayList<>();

    private static void addEntry(String date, String text) {
        for (DiaryEntry e : diary) {
            if (e.date.equals(date)) {
                System.out.println("Duplicate date! Entry not added.");
                return;
            }
        }
        diary.add(new DiaryEntry(date, text));
        diary.sort(Comparator.comparing((DiaryEntry e) -> e.date).reversed());
    }

    private static void editEntry(String date, String text) {
        for (DiaryEntry e : diary) {
            if (e.date.equals(date)) {
                e.entry = text;
                System.out.println("Entry updated.");
                return;
            }
        }
        System.out.println("Entry not found.");
    }

    private static void deleteEntry(String date) {
        diary.removeIf(e -> e.date.equals(date));
        System.out.println("Entry deleted if it existed.");
    }

    private static void displayEntries() {
        System.out.println("Diary entries:");
        for (DiaryEntry e : diary) {
            System.out.println(e.date + ": " + e.entry);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        addEntry("2025-09-19", "Started Java practice.");
        addEntry("2025-09-18", "Went to the gym.");
        addEntry("2025-09-17", "Read a book.");
        displayEntries();

        System.out.print("Edit entry for 2025-09-18: ");
        String newText = sc.nextLine();
        editEntry("2025-09-18", newText);

        displayEntries();

        deleteEntry("2025-09-17");
        displayEntries();
    }
}
