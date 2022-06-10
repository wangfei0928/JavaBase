package com.lanou.day04.day03homework;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Point point = new Point();
        point.x = 10;
        point.y = 20;

        rectangle.point = point;
        rectangle.width = 40;
        rectangle.height = 20;

        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.center());

        Rectangle rectangle2 = new Rectangle();
        Point point2 = new Point();
        point2.x = 50;
        point2.y = 30;
        rectangle2.point = point2;
        rectangle2.width = 30;
        rectangle2.height = 30;
        System.out.println(rectangle.intersect(rectangle2));
    }
}
