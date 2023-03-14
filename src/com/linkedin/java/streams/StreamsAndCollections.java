package com.linkedin.java.streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsAndCollections {

    public static void main(String[] args) {
        var animals = new ArrayList<String>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Mouse");

        Stream<String> animalStream = animals.stream();
        String collectedAnimals = animalStream
                .collect(Collectors.joining(";"));

        System.out.println(collectedAnimals);

        String collectedAnimals2 = String.join(":", animals);

        System.out.println(collectedAnimals2);

        Set<String> animalsSet = new HashSet<>(animals);

        Map<Integer, Long> collectedAnimalCounts = animals.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));

        System.out.println(collectedAnimalCounts);

    }

}
