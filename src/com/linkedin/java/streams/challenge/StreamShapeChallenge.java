package com.linkedin.java.streams.challenge;

import com.linkedin.java.oop.shapes.Circle;
import com.linkedin.java.oop.shapes.Rectangle;
import com.linkedin.java.oop.shapes.Shape;
import com.linkedin.java.oop.shapes.Square;
import com.linkedin.java.oop.shapes.challenge.Triangle;

import java.util.ArrayList;

public class StreamShapeChallenge {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(5, 10));
        shapes.add(new Square(9));
        shapes.add(new Triangle(3, 4, 5));

        double sum = shapes.stream()
                .mapToDouble(Shape::getArea)
                .sum();

        System.out.println(sum);
    }

}
