package com.session19a;

import java.util.List;

public class Email {
    public static void sendAnnouncement(List<? extends User> recipients, String subject, String message) {
        System.out.println("\nCompany Announcement");
        for (User user : recipients) {
            user.sendEmail(subject, message);
        }
    }
}
