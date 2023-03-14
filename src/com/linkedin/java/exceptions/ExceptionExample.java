package com.linkedin.java.exceptions;

public class ExceptionExample {

    public static void main(String[] args) {
        var divisor = 0;
        try {
            var x = 42 / divisor;
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.err.println("An error happened: " + e.getMessage());
        }


    }
}
