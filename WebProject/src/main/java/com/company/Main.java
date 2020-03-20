package com.company;

import main.java.com.company.Line;
import main.java.com.company.Point;

public class Main {

    public static void main(String[] args) {
        Line line = new Line(new Point(1, 2), new Point(3, 4));
        System.out.println(line.toString());
    }
}
