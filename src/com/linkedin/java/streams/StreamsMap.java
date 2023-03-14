package com.linkedin.java.streams;

import java.util.List;
import java.util.stream.Stream;

public class StreamsMap {

    public static void main(String[] args) {
        List<String> animalsCaps = Stream.of("Cat", "Dog", "Mouse", "Bird", "Tiger", "Lion")
                .map(String::toUpperCase)
                .toList();
        System.out.println(animalsCaps);

        List<String> beginningLetters = Stream.of("Cat", "Dog", "Mouse", "Bird", "Tiger", "Lion", "")
                .filter(a -> !a.isEmpty())
                .map(a -> a.substring(0, 1))
                .toList();

        System.out.println(beginningLetters);
    }

}
