package com.session19a;

public class Admin extends User {

    public Admin(String name, String email) {
        super(name, email, Roles.ADMIN);
    }

    public void updateApplicationSettings(String setting, String value) {
        System.out.println("Admin update setting: " + setting + " = " + value);
    }
}
