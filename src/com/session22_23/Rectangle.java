package com.session22_23;

public class Rectangle {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle other = (Rectangle) obj;
        return width == other.width && height == other.height;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(width) ^ Integer.hashCode(height);
    }
}

