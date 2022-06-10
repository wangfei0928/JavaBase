package com.lanou.day04.day03homework;

public class Rectangle {
/*
* 定义一个 矩形类,包括一个点(左上角的点)和宽度,高度(点可以借助上题定义的点类).提供如下方法:
* 计算矩形面积的方法,计算矩形周长的方法,计算矩形是否相交的方法（面试题）计算矩形中心点的方法(返回值是一个点).
* */
    Point point;   //左上角的坐标
    double width;   //宽度
    double height;  //高度

    /*
    * 计算矩形面积
    * */
    public double area(){
        return width* height;
    }

    /**
     * 计算矩形周长
     * @return 返回矩形周长
     */
    public double perimeter(){
        return 2 * (width + height);
    }

    /**
     * 返回矩形中心点
     * @return
     */
    public Point center(){
        double x = point.x + width / 2;
        double y = point.y + height / 2;
        Point centerPoint = new Point();
        centerPoint.x = x;
        centerPoint.y = y;
        return  centerPoint;
    }

    /**
     * 当前矩形和另外一个矩形是否相交
     * @param r 另外一个矩形
     * @return
     */
    public boolean intersect(Rectangle r){
        boolean intersect = true;
        double minX1 = point.x;  //当前矩形最小x
        double minY1 = point.y;  //当前矩形最小的y
        double maxX1 = width + minX1;  //当前矩形最大x
        double maxY1 = height + minY1; //当前矩形最大的y

        double minX2 = r.point.x;  //另外一个矩形最小x
        double minY2 = r.point.y;  //另外一个矩形最小的y
        double maxX2 = r.width + r.point.x;  //另外一个矩形最大x
        double maxY2 = r.height + r.point.y; //另外一个矩形最大的y

        if (maxX1 < minX2 || minX1 >maxX2 || minY1 >maxY2 || maxY1 <minY2){
            intersect = false;
        }
        return  intersect;
    }

}
