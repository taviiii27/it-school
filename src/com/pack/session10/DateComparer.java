package com.pack.session10;

import java.time.LocalDate;
import java.util.Scanner;

public class DateComparer {
    public static boolean areDatesEqual() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first date (YYYY-MM-DD): ");
        LocalDate d1 = LocalDate.parse(sc.nextLine());
        System.out.print("Enter second date (YYYY-MM-DD): ");
        LocalDate d2 = LocalDate.parse(sc.nextLine());
        return d1.equals(d2);
    }

    public static void main(String[] args) {
        System.out.println("Are dates equal? " + areDatesEqual());
    }
}
