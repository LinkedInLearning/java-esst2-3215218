package com.linkedin.java.exceptions.challenge;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileLineAppender {

    private final Path targetFile;


    public FileLineAppender(String target) {
        this.targetFile = Path.of(target);
    }

    void appendLineToFile(String line) {
        line = line + System.lineSeparator();

        try {
            Files.write(targetFile, line.getBytes(), StandardOpenOption.APPEND);
        } catch (NoSuchFileException e) {
            try {
                Files.createFile(targetFile);
                Files.write(targetFile, line.getBytes(), StandardOpenOption.APPEND);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        } catch (IOException e) {
            System.err.println("Error writing to file " + e);
        }
    }

    public static void main(String[] args) {
        FileLineAppender appender = new FileLineAppender("my_test_file.txt");
        appender.appendLineToFile("First line");
        appender.appendLineToFile("Second line");
    }
}
