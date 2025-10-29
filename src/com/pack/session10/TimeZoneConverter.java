package com.pack.session10;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeZoneConverter {
    public static void convertToTimeZone() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date and time (YYYY-MM-DD HH:MM:SS): ");
        String dateTimeStr = sc.nextLine();
        System.out.print("Enter timezone (e.g., America/New_York): ");
        String zoneIdStr = sc.nextLine();

        LocalDateTime ldt = LocalDateTime.parse(dateTimeStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        ZoneId targetZone = ZoneId.of(zoneIdStr);

        ZonedDateTime zonedDateTime = ldt.atZone(ZoneId.systemDefault()).withZoneSameInstant(targetZone);
        System.out.println("Converted: " + zonedDateTime);
    }

    public static void main(String[] args) {
        convertToTimeZone();
    }
}
