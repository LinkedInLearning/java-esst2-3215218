package com.linkedin.java.streams;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsIntro {

    public static void main(String[] args) {
        Map<Integer, Long> counts = Stream.of("", "one", "two", "three", "four", "five", "")
                .filter(s -> !s.isEmpty())
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));

        System.out.println(counts);
    }

}
