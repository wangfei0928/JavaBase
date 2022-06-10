package com.lanou.day04.day03homework;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 0;
        p1.y = 3;
        System.out.println(p1);

        Point p2 = new Point();
        p2.x = 4;
        p2.y = 0;
        System.out.println(p2);

        System.out.println(p1.distanceTo(p2));
    }
}
