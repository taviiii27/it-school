package com.session19b;

public class Payment {
    private final String paymentMethod;
    private final double amount;
    private PaymentStatus status;

    public Payment(String paymentMethod, double amount) {
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.status = PaymentStatus.PENDING;
    }

    public void processPayment() {
        status = PaymentStatus.COMPLETED;
        System.out.println("Payment of lei" + amount + " via " + paymentMethod + " processed successfully.");
    }

    public void displayPaymentInfo() {
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Amount: lei" + amount);
        System.out.println("Status: " + status);
    }

    public PaymentStatus getStatus() {
        return status;
    }
}
