package com.linkedin.java.oop.shapes.challenge;

import com.linkedin.java.oop.shapes.Shape;

public class Triangle implements Shape {

    private final int a;
    private final int b;
    private final int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        return (1.0 / 4.0) * Math.sqrt((a + b +c) * (a + b -c) * (a - b + c) * (-a + b + c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    public static void main(String[] args) {
        var triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }
}
