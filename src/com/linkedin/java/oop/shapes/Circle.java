package com.linkedin.java.oop.shapes;

public class Circle implements Shape {

    private int radius;

    static double PI = 3.14159265358979323846;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * PI;
    }

    public double getPerimeter() {
        return 2 * radius * PI;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Circle)) {
            return false;
        }

        Circle circle = (Circle) o;

        return this.radius == circle.radius;
    }

    public int hashCode() {
        return radius;
    }

    public String toString() {
        return "Circle with radius " + radius;
    }

}
