package com.lanou.day04.day03homework;

public class Point {
/*
*  定义一个 点 类.包含x坐标和y坐标. 提供一个打印点的坐标的方法, 以及一个计算当前点和另外一个点距离的方法.
* */
    double x;
    double y;

    /*
    * 当前点与另外一个点的距离
    * point 另外一个点
    *
    * */
    public double distanceTo(Point point){
        double dx = x - point.x;
        double dy = y - point.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
