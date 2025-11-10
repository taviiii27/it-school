package com.session19b;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Order {
    private static final AtomicInteger counter = new AtomicInteger(1000);

    private final int orderNumber;
    private final Customer customer;
    private final List<Product> products;
    private OrderStatus status;

    public Order(Customer customer, List<Product> products) {
        this.orderNumber = counter.getAndIncrement();
        this.customer = customer;
        this.products = products;
        this.status = OrderStatus.CREATED;
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void updateStatus(OrderStatus newStatus) {
        this.status = newStatus;
    }

    public void displayOrderInfo() {
        System.out.println("Order #" + orderNumber + " (" + status + ")");
        for (Product p : products) {
            System.out.println(" - " + p.getName() + " (lei" + p.getPrice() + ")");
        }
        System.out.println("Total: lei" + calculateTotal());
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public OrderStatus getStatus() {
        return status;
    }
}
