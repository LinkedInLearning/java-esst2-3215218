package com.linkedin.java.oop.shapes;

public class Line {

    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double getLength() {
        return Math.sqrt(Math.pow(end.x() - start.x(), 2) + Math.pow(end.y() - start.y(), 2));
    }

}
