package com.lanou.day04.inherit;
/*
* 通常情况下，子类不会出现和父类同名的属性！！
* 如果父类和子类中存在同名属性，子类访问的是自身的属性。
* 在内存里，子类有2个变量（一个是父类的变量，一个是子类的）
* this和super区别
* 1. this是一个对象。 this是方法调用者。 this都是出现在方法中的， 谁调用方法，this就是谁。所以this可以访问方法，访问属性。
* 2. super仅仅是一个关键字，不是对象。它可以调用父类中的属性（非私有），方法（非私有）以及构造方法
* 如果B继承A， C继承了B，那么C将拥有B以及A全部内容（构造方法除外）  子类可以把继承链上的所有属性和方法都继承过来（构造方法除外。）
* 所有类的根类（祖先类） 是Object 如果一个类创建的时候，没有写父类，那么它的父类是Object
*
* */
public class Father {
    private int a = 10;  //a 只能在本类通过点语法调用
    int b = 20;
    protected  int c = 30;
    public int d =  40;


    public Father() {
        System.out.println("父类无参构造方法");
    }

    public Father(int a, int b, int c, int d) {
        System.out.println("父类有参构造方法");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public void method1(){
        System.out.println("我是父类中的方法");
    }
    protected void method2(){
        System.out.println("我是父类中的方法 protected");
    }
     void method3(){
        System.out.println("我是父类中的方法   缺省");
    }
    private void method4(){
        System.out.println("父类 private");

    }
}
