package com.linkedin.java.oop.shapes;

public class InvalidRectangleDefinitionException extends RuntimeException {

    public InvalidRectangleDefinitionException(int width, int height) {
        super("Invalid rectangle with width " + width + " and height " + height);

    }

}
