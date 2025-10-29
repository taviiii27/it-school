package com.session19a;

public class User implements Notifications{
    protected String name;
    protected String email;
    protected Roles role;

    public User(String name, String email, Roles role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }

    @Override
    public void sendEmail(String subject, String message){
        System.out.println("Sending email to " + name + " <" + email + ">:\n" + subject + "\n" + message);
    }
}

