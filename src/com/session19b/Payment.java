package com.session19b;

public class Payment {
    private String paymentMethod;
    private double amount;
    private String status;

    public Payment(String paymentMethod, double amount) {
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.status = "Pending";
    }

    public void processPayment() {
        status = "Completed";
        System.out.println("Payment of lei" + amount + " via " + paymentMethod + " processed successfully.");
    }

    public void displayPaymentInfo() {
        System.out.println("Payment: " + paymentMethod + " | Amount: $" + amount + " | Status: " + status);
    }

    public void updateStatus(String newStatus) {
        status = newStatus;
    }
}
