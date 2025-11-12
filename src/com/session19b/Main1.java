package com.session19b;

public class Main1 {
    public static void main(String[] args) {
        Customer customer = new Customer("Alex", "alex@mail.com", "Str. Florilor", "Str.Florilor");
        Product laptop = new Product("Laptop", "16GB RAM, i7 CPU", 3000.00, 5);
        Product mouse = new Product("Mouse", "Wireless Mouse", 100.00, 10);

        customer.addToCart(laptop);
        customer.addToCart(mouse);

        Order order = customer.placeOrder();
        if (order != null) {
            order.displayOrderInfo();

            Payment payment = new Payment("Credit Card", order.calculateTotal());
            payment.processPayment();
            payment.displayPaymentInfo();

            order.updateStatus(OrderStatus.SHIPPED);
            customer.trackOrderStatus(order);
        }
    }
}

