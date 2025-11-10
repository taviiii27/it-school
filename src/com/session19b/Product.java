package com.session19b;

public class Product {
    private final String name;
    private final String description;
    private final double price;
    private int quantity;

    public Product(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public void addToInventory(int amount) {
        quantity += amount;
    }

    public void removeFromInventory(int amount) {
        if (quantity >= amount) quantity -= amount;
    }

    public boolean isInStock() {
        return quantity > 0;
    }

    public void displayProductInfo() {
        System.out.println(name + " - " + description + " | lei" + price + " | Stock: " + quantity);
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
}
