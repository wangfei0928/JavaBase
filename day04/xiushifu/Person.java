package com.lanou.day04.xiushifu;

/*
* 权限访问修饰符(是否有权限，使用.语法)：也叫可见度访问修饰符
* 可见度修饰符  可以修饰类，也可以修饰类的成员
* 如果修饰类，只有两种可见度，public 缺省
* 修饰类的成员 属性，方法 private 缺省 protected public
*
*( private 不能在类外部使用同包的其他类)通过点语法访问
* 如果跨包访问属性或者方法,只能访问public修饰符修饰的属性或者属性。  public
* */

public class Person {
    private int a;
    protected int b;
    public  int c;
    int d;

}
