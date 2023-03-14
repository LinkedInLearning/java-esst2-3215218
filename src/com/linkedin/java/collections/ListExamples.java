package com.linkedin.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {

    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Mouse");

        System.out.println(animals);

        animals.add(1, "Bird");

        System.out.println(animals);

        animals.remove("Bird");

        System.out.println(animals);

        System.out.println(animals.get(0));

        System.out.println(animals.size());

        System.out.println(animals.contains("Cat"));
        System.out.println(animals.contains("Tiger"));

        animals.add("Cat");
        System.out.println(animals);

        for (var animal : animals) {
            System.out.println("Found animal: " + animal);
        }

    }

}
