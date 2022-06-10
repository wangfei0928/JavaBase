package com.lanou.day04.inherit;
/*
* /*
 * ：通过继承设计猫（Cat）和狗（Dog）类，并编写代码测试。猫有姓名和年龄属性，
 * 有抓老鼠的方法（catchMouse）。狗有姓名和年龄，有看门的方法（lookDoor）。
 * */

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String name, Integer age) {
        super(name, age);
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");

    }
}
