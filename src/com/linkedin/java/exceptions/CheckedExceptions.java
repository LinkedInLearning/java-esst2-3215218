package com.linkedin.java.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CheckedExceptions {

    public static void main(String[] args) {
        try {
            var lines = Files.readAllLines(Path.of("test_file2.txt"));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
