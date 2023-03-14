package com.linkedin.java.oop.shapes;

public class Interfaces {

    public static void main(String[] args) {
        var circle = new Circle(5);
        var rectangle = new Rectangle(5, 10);
        var square = new Square(7);

        describeShape(circle);
        describeShape(rectangle);
        describeShape(square);
    }

    static void describeShape(Shape s) {
        String description = s.toString() + " with area " + s.getArea() + " and perimeter " + s.getPerimeter();
        System.out.println(description);
    }

}
