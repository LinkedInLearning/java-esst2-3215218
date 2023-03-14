package com.linkedin.java.collections.challenge;

import com.linkedin.java.oop.shapes.Circle;
import com.linkedin.java.oop.shapes.Rectangle;
import com.linkedin.java.oop.shapes.Shape;
import com.linkedin.java.oop.shapes.Square;
import com.linkedin.java.oop.shapes.challenge.Triangle;

import java.util.ArrayList;
import java.util.Collection;

public class ShapeCollectionChallenge {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(5, 10));
        shapes.add(new Square(9));
        shapes.add(new Triangle(3, 4, 5));

        System.out.println(shapeAreaSum(shapes));
    }


    static double shapeAreaSum(Collection<Shape> shapes) {

        double sum = 0;
        for (Shape s : shapes) {
            sum += s.getArea();
        }

        return sum;
    }

}
