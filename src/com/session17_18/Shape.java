package com.session17_18;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    abstract double area();
}

class Rectangle extends Shape {
    double length, width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

class Square extends Shape {
    double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class TestShape {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(4, 5));
        shapes.add(new Square(3));
        shapes.add(new Circle(2));

        for (Shape shape : shapes) {
            System.out.println(shape.getName() + " area: " + shape.area());
        }
    }
}
