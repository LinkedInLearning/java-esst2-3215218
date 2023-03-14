package com.linkedin.java.collections;

import com.linkedin.java.oop.shapes.Circle;

import java.util.HashSet;

public class SetExamples {

    public static void main(String[] args) {
        var animals = new HashSet<String>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Mouse");

        System.out.println(animals);

        animals.add("Cat");
        System.out.println(animals);

        var circles = new HashSet<Circle>();
        circles.add(new Circle(42));
        circles.add(new Circle(42));
        System.out.println(circles.size());

        circles.add(new Circle(43));
        System.out.println(circles.size());

        for (var animal : animals) {
            System.out.println(animal);
        }
    }

}
