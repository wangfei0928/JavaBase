package com.lanou.day04.packaging;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(4,0);
        Point p2 = new Point(0,3);
        System.out.println(p1.distanceTo(p2));
    }
}
