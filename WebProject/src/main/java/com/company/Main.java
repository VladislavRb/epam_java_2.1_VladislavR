package com.company;

import main.java.com.company.Line;
import main.java.com.company.Point;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static Logger logger = LogManager.getLogger(Main.class.getName());
    public static void main(String[] args) {
        Line line = new Line(new Point(1, 2), new Point(3, 4));
        System.out.println(line.toString());

        logger.info("info message");
        logger.error("error message");
    }
}
