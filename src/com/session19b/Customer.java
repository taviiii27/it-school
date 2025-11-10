package com.session19b;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private final String email;
    private final String shippingAddress;
    private final String billingAddress;
    private final List<Product> cart;
    private final List<Order> orders;

    public Customer(String name, String email, String shippingAddress, String billingAddress) {
        this.name = name;
        this.email = email;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.cart = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addToCart(Product p) {
        cart.add(p);
        System.out.println(p.getName() + " added to cart.");
    }

    public void removeFromCart(Product p) {
        cart.remove(p);
    }

    public Order placeOrder() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty!");
            return null;
        }
        Order order = new Order(this, new ArrayList<>(cart));
        orders.add(order);
        cart.clear();
        System.out.println("Order placed successfully!");
        return order;
    }

    public void viewOrderHistory() {
        System.out.println("Order History for " + name + ":");
        for (Order o : orders) {
            o.displayOrderInfo();
        }
    }

    public void trackOrderStatus(Order order) {
        System.out.println("Order #" + order.getOrderNumber() + " status: " + order.getStatus());
    }

    public String getName() { return name; }
}

