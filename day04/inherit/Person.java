package com.lanou.day04.inherit;

/*
* 面向对象的三大特性： 封装，继承，多态。
* 封装：不要对外暴露属性，属性定义成private，提供public修饰的setter/getter方法。 方法封装了实现细节。类封装了属性和方法。  在使用的时候，使用对象。
* 继承：有大功能。 功能一：在保证程序功能不变的情况下，简化代码。
*               功能二：可以站在巨人的肩膀上，扩展功能。
* 在Java中， 子类可以继承父类所有的属性和方法（构造方法除外）。----私有方法和私有属性也能继承。虽然能继承，但是不能通过 点语法 访问，可以间接访问。
* 子类可以继承父类所有的属性和方法（构造方法除外): 父类的构造在子类中没有返回类型,方法名也与子类的类名不相同
* 子类不但可以继承父类的方法和属性，还可以添加自己独有的属性和方法。
* 方法重载？
在同一个类中，如果有多个方法具有相同的方法名，但是参数类型或者参数个数 不同（或者都不同）。这样的方法称为方法重载。 方法重载允许定义同名方法，能够适当的解决命名危机问题。
* 在继承关系里，子类如果不满意继承过来的方法实现，可以重写方法。
*
* java只允许单继承 一个类只能有一个爹
*
* super关键字 三个功能：
* 1. 访问父类的属性
* 2. 访问父类的方法
* 3. 调用父类的构造方法
* */
public class Person {

    private String name;
    private  Integer age;
    private  String sex;

    public Person() {
    }

    public Person(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
