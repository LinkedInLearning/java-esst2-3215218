package com.linkedin.java.oop.shapes;

public class RecordsExample {

    public static void main(String[] args) {
        var line = new Line(new Point(0, 0), new Point(3, 4));
        System.out.println(line.getLength());
    }

}
