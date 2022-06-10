package com.lanou.day04.inherit;
/*
* ：通过继承设计猫（Cat）和狗（Dog）类，并编写代码测试。猫有姓名和年龄属性，
* 有抓老鼠的方法（catchMouse）。狗有姓名和年龄，有看门的方法（lookDoor）。
* */

public class Animal {
    private String name;
    private  Integer age;

    public Animal() {
    }

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}