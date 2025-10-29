package com.session19a;

public class Resource {
    private String name;
    private int quantity;
    private ResourceTypes type;

    public Resource(String name, int quantity, ResourceTypes type) {
        this.name = name;
        this.quantity = quantity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public ResourceTypes getType() {
        return type;
    }

    public void updateQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }
}

